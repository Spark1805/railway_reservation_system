package com.prnv.jfsd.trs.dto;

import java.time.LocalTime;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "trainNumber",
        "trainName",
        "departureTime",
        "arrivalTime",
        "seatAvailability"
})
public class TrainSearchResponse
{

    private Long id;
    private String trainNumber;
    private String trainName;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    private Map<String,Integer> seatAvailability;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTrainNumber()
    {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber)
    {
        this.trainNumber = trainNumber;
    }

    public String getTrainName()
    {
        return trainName;
    }

    public void setTrainName(String trainName)
    {
        this.trainName = trainName;
    }

    public LocalTime getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime)
    {
        this.departureTime = departureTime;
    }

    public LocalTime getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }

    public Map<String,Integer> getSeatAvailability()
    {
        return seatAvailability;
    }

    public void setSeatAvailability(Map<String,Integer> seatAvailability)
    {
        this.seatAvailability = seatAvailability;
    }

}