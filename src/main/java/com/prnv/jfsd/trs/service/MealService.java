package com.prnv.jfsd.trs.service;

import org.springframework.stereotype.Service;

@Service
public class MealService
{

    public double calculateMealPrice(String item)
    {
    	
        switch(item)
        {
            case "VEG_MEAL":
                return 120;

            case "NON_VEG_MEAL":
                return 180;

            case "COFFEE":
                return 25;

            case "MILK":
                return 20;

            case "WATER":
                return 20;
        }

        return 0;

    }

}