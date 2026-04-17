package com.prnv.jfsd.trs.service;

import org.springframework.stereotype.Service;

@Service
public class FareService
{
    public double calculateFare(String coachType)
    {
        double baseFare = 0;
        switch(coachType)
        {

            case "3AC":
                baseFare = 670;
                break;

            case "2AC":
                baseFare = 1120;
                break;

            case "CHAIR_CAR":
                baseFare = 575;
                break;

            case "SECOND_SITTING":
                baseFare = 170;
                break;

        }

        double gst = baseFare * 0.05;

        return baseFare + gst;

    }
}