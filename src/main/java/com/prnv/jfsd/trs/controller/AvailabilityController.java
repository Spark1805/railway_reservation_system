package com.prnv.jfsd.trs.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prnv.jfsd.trs.service.SeatAvailabilityService;

@RestController
@RequestMapping("/availability")
public class AvailabilityController
{

    @Autowired
    private SeatAvailabilityService seatAvailabilityService;

    @GetMapping("/train/{id}")
    public Map<String,Integer> checkSeats(@PathVariable Long id)
    {

    	return seatAvailabilityService.getSeatAvailability(id);

    }

}