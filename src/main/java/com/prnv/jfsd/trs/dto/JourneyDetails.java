package com.prnv.jfsd.trs.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "fromStation",
    "toStation",
    "travelDate",
    "departureTime",
    "arrivalTime"
})
public class JourneyDetails
{

    private String fromStation;
    private String toStation;
    private LocalDate travelDate;
    private LocalTime departureTime;
    private LocalTime arrivalTime;

    public String getFromStation()
    {
        return fromStation;
    }

    public void setFromStation(String fromStation)
    {
        this.fromStation = fromStation;
    }

    public String getToStation()
    {
        return toStation;
    }

    public void setToStation(String toStation)
    {
        this.toStation = toStation;
    }

    public LocalDate getTravelDate()
    {
        return travelDate;
    }

    public void setTravelDate(LocalDate travelDate)
    {
        this.travelDate = travelDate;
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

}