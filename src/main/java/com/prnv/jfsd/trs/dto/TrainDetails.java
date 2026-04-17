package com.prnv.jfsd.trs.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "trainNumber",
    "trainName"
})
public class TrainDetails
{

    private String trainNumber;
    private String trainName;

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

}