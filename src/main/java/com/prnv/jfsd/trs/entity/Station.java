package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;

@Entity
@Table(name="station")
public class Station
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String stationCode;

    private String stationName;

    public Station()
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

    public String getStationCode()
    {
        return stationCode;
    }

    public void setStationCode(String stationCode)
    {
        this.stationCode=stationCode;
    }

    public String getStationName()
    {
        return stationName;
    }

    public void setStationName(String stationName)
    {
        this.stationName=stationName;
    }

}