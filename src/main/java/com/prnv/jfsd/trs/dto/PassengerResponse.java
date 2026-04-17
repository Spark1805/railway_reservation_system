package com.prnv.jfsd.trs.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "name",
    "age",
    "seatNumber",
    "berth",
    "status"
})
public class PassengerResponse
{

    private String name;
    private Integer age;
    private String seatNumber;
    private String berth;
    private String status;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    public String getBerth()
    {
        return berth;
    }

    public void setBerth(String berth)
    {
        this.berth = berth;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

}