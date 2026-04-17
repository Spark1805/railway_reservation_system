package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="route")
public class Route
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="train_id")
    @JsonBackReference
    private Train train;

    @ManyToOne
    @JoinColumn(name="station_id")
    private Station station;

    private int stopOrder;

    public Route()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id=id;
    }

    public Train getTrain()
    {
        return train;
    }

    public void setTrain(Train train)
    {
        this.train=train;
    }

    public Station getStation()
    {
        return station;
    }

    public void setStation(Station station)
    {
        this.station=station;
    }

    public int getStopOrder()
    {
        return stopOrder;
    }

    public void setStopOrder(int stopOrder)
    {
        this.stopOrder=stopOrder;
    }

}