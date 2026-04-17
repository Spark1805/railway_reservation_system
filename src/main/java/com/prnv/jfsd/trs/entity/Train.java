package com.prnv.jfsd.trs.entity;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="train")
public class Train
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String trainNumber;

    private String trainName;

    @OneToMany(mappedBy="train")
    @JsonManagedReference
    private List<Route> routes;

    public Train()
    {
    }

    public Train(String trainNumber,String trainName)
    {
        this.trainNumber=trainNumber;
        this.trainName=trainName;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id=id;
    }

    public String getTrainNumber()
    {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber)
    {
        this.trainNumber=trainNumber;
    }

    public String getTrainName()
    {
        return trainName;
    }

    public void setTrainName(String trainName)
    {
        this.trainName=trainName;
    }

    public List<Route> getRoutes()
    {
        return routes;
    }

    public void setRoutes(List<Route> routes)
    {
        this.routes=routes;
    }

}