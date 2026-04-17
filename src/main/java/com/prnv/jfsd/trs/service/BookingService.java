package com.prnv.jfsd.trs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prnv.jfsd.trs.dto.BookingRequest;
import com.prnv.jfsd.trs.dto.BookingResponse;
import com.prnv.jfsd.trs.dto.CoachDetails;
import com.prnv.jfsd.trs.dto.FareDetails;
import com.prnv.jfsd.trs.dto.JourneyDetails;
import com.prnv.jfsd.trs.dto.PassengerDTO;
import com.prnv.jfsd.trs.dto.PassengerResponse;
import com.prnv.jfsd.trs.dto.TrainDetails;
import com.prnv.jfsd.trs.entity.Passenger;
import com.prnv.jfsd.trs.entity.Schedule;
import com.prnv.jfsd.trs.entity.Ticket;
import com.prnv.jfsd.trs.entity.User;
import com.prnv.jfsd.trs.repository.PassengerRepository;
import com.prnv.jfsd.trs.repository.ScheduleRepository;
import com.prnv.jfsd.trs.repository.TicketRepository;
import com.prnv.jfsd.trs.repository.UserRepository;

@Service
public class BookingService
{

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private UserRepository userRepository;

    public BookingResponse bookTicket(BookingRequest request)
    {

        User user = userRepository.findById(request.getUserId()).orElseThrow();

        Schedule schedule = scheduleRepository.findById(request.getScheduleId()).orElseThrow();

        String pnr = UUID.randomUUID().toString().substring(0,8).toUpperCase();

        List<Ticket> ticketList = new ArrayList<>();

        int seatCounter = ticketRepository.countByScheduleId(schedule.getId()) + 1;

        for(PassengerDTO p : request.getPassengers())
        {

            Passenger passenger = new Passenger();
            passenger.setName(p.getFirstName() + " " + p.getLastName());
            passenger.setAge(p.getAge());

            passengerRepository.save(passenger);

            Ticket ticket = new Ticket();

            ticket.setUser(user);
            ticket.setPassenger(passenger);
            ticket.setSchedule(schedule);
            ticket.setCoachType(request.getCoachType());
            ticket.setTravelDate(schedule.getDepartureDate());

            int seatNum = seatCounter;

            String coachName = "B" + ((seatNum - 1) / 64 + 1);

            ticket.setSeatNumber(String.valueOf(seatNum));
            ticket.setCoachName(coachName);

            seatCounter++;

            ticket.setStatus("CONFIRMED");
            ticket.setBookingStatus("CNF");
            ticket.setPnrNumber(pnr);

            ticketList.add(ticket);
        }

        List<Ticket> savedTickets = ticketRepository.saveAll(ticketList);

        double baseFare = 800;

        double totalCost = baseFare * savedTickets.size();

        Ticket first = savedTickets.get(0);

        BookingResponse response = new BookingResponse();

        response.setPnrNumber(first.getPnrNumber());

        TrainDetails train = new TrainDetails();
        train.setTrainNumber(first.getSchedule().getTrain().getTrainNumber());
        train.setTrainName(first.getSchedule().getTrain().getTrainName());

        JourneyDetails journey = new JourneyDetails();
        journey.setFromStation(first.getSchedule().getFromStation());
        journey.setToStation(first.getSchedule().getToStation());
        journey.setTravelDate(first.getTravelDate());
        journey.setDepartureTime(first.getSchedule().getDepartureTime());
        journey.setArrivalTime(first.getSchedule().getArrivalTime());

        CoachDetails coach = new CoachDetails();
        coach.setCoachName(first.getCoachName());
        coach.setCoachType(first.getCoachType());

        FareDetails fare = new FareDetails();
        fare.setTotalCost(totalCost);

        response.setTrain(train);
        response.setJourney(journey);
        response.setCoach(coach);
        response.setFare(fare);

        List<PassengerResponse> passengerResponses = new ArrayList<>();

        for(Ticket t : savedTickets)
        {

            PassengerResponse pr = new PassengerResponse();

            int seat = Integer.parseInt(t.getSeatNumber());

            pr.setName(t.getPassenger().getName());
            pr.setAge(t.getPassenger().getAge());
            pr.setSeatNumber(t.getSeatNumber());
            pr.setBerth(getBerth(seat, t.getPassenger().getAge()));
            pr.setStatus(t.getStatus());

            passengerResponses.add(pr);
        }

        response.setPassengers(passengerResponses);

        return response;
    }

    private String getBerth(int seatNumber, int age)
    {

        int position = seatNumber % 8;

        String berth;

        switch(position)
        {
            case 1:
            case 4:
                berth = "LB";
                break;

            case 2:
            case 5:
                berth = "MB";
                break;

            case 3:
            case 6:
                berth = "UB";
                break;

            case 7:
                berth = "SL";
                break;

            case 0:
                berth = "SU";
                break;

            default:
                berth = "UB";
        }

        if(age >= 35)
        {
            if(berth.equals("LB") || berth.equals("SL"))
                return berth;

            return "LB";
        }

        return berth;
    }

}