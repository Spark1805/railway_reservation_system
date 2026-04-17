package com.prnv.jfsd.trs.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "pnrNumber",
    "train",
    "journey",
    "coach",
    "fare",
    "passengers"
})
public class BookingResponse
{

    private String pnrNumber;

    private TrainDetails train;

    private JourneyDetails journey;

    private CoachDetails coach;

    private FareDetails fare;

    private List<PassengerResponse> passengers;

    public String getPnrNumber()
    {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber)
    {
        this.pnrNumber = pnrNumber;
    }

    public TrainDetails getTrain()
    {
        return train;
    }

    public void setTrain(TrainDetails train)
    {
        this.train = train;
    }

    public JourneyDetails getJourney()
    {
        return journey;
    }

    public void setJourney(JourneyDetails journey)
    {
        this.journey = journey;
    }

    public CoachDetails getCoach()
    {
        return coach;
    }

    public void setCoach(CoachDetails coach)
    {
        this.coach = coach;
    }

    public FareDetails getFare()
    {
        return fare;
    }

    public void setFare(FareDetails fare)
    {
        this.fare = fare;
    }

    public List<PassengerResponse> getPassengers()
    {
        return passengers;
    }

    public void setPassengers(List<PassengerResponse> passengers)
    {
        this.passengers = passengers;
    }

}