package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="schedule")
public class Schedule
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromStation;

    private String toStation;

    private LocalDate departureDate;

    private LocalTime departureTime;

    private LocalTime arrivalTime;

    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    public Schedule(){}

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id=id;
    }

    public String getFromStation()
    {
        return fromStation;
    }

    public void setFromStation(String fromStation)
    {
        this.fromStation=fromStation;
    }

    public String getToStation()
    {
        return toStation;
    }

    public void setToStation(String toStation)
    {
        this.toStation=toStation;
    }

    public LocalDate getDepartureDate()
    {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate)
    {
        this.departureDate=departureDate;
    }

    public LocalTime getDepartureTime()
    {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime)
    {
        this.departureTime=departureTime;
    }

    public LocalTime getArrivalTime()
    {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime)
    {
        this.arrivalTime=arrivalTime;
    }

    public Train getTrain()
    {
        return train;
    }

    public void setTrain(Train train)
    {
        this.train=train;
    }

}