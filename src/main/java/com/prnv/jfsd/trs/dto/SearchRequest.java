package com.prnv.jfsd.trs.dto;

public class SearchRequest
{

    private String fromStation;
    private String toStation;
    private String travelDate;
    private String quota;

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

    public String getTravelDate()
    {
        return travelDate;
    }

    public void setTravelDate(String travelDate)
    {
        this.travelDate = travelDate;
    }

    public String getQuota()
    {
        return quota;
    }

    public void setQuota(String quota)
    {
        this.quota = quota;
    }

}