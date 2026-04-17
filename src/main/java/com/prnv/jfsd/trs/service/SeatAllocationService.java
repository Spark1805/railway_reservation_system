package com.prnv.jfsd.trs.service;

import org.springframework.stereotype.Service;

@Service
public class SeatAllocationService
{

    public String allocateSeat(int age)
    {

        if(age >= 35)
        {
            return "LOWER";
        }
        else
        {
            return "UPPER";
        }

    }

}