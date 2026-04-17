package com.prnv.jfsd.trs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prnv.jfsd.trs.dto.TrainSearchResponse;
import com.prnv.jfsd.trs.entity.Schedule;
import com.prnv.jfsd.trs.entity.Train;
import com.prnv.jfsd.trs.repository.RouteRepository;
import com.prnv.jfsd.trs.repository.ScheduleRepository;

@Service
public class TrainService
{

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private SeatAvailabilityService seatAvailabilityService;

    public List<TrainSearchResponse> searchTrains(String from,String to,String date)
    {

        List<Train> trains = routeRepository.findTrainsBetweenStations(from,to);

        List<TrainSearchResponse> response = new ArrayList<>();

        for(Train t : trains)
        {

            TrainSearchResponse r = new TrainSearchResponse();

            r.setId(t.getId());
            r.setTrainNumber(t.getTrainNumber());
            r.setTrainName(t.getTrainName());

            // fetch schedules
            List<Schedule> schedules = scheduleRepository.findByTrainId(t.getId());

            if(!schedules.isEmpty())
            {
                Schedule s = schedules.get(0); // take first schedule
                r.setDepartureTime(s.getDepartureTime());
                r.setArrivalTime(s.getArrivalTime());
            }

            r.setSeatAvailability(
                    seatAvailabilityService.getSeatAvailability(t.getId())
            );

            response.add(r);
        }

        return response;
    }

}