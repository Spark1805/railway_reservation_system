package com.prnv.jfsd.trs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prnv.jfsd.trs.entity.Coach;
import com.prnv.jfsd.trs.repository.CoachRepository;

import java.util.*;

@Service
public class SeatAvailabilityService
{

    @Autowired
    private CoachRepository coachRepository;

    public Map<String,Integer> getSeatAvailability(Long trainId)
    {

        List<Coach> coaches = coachRepository.findByTrainId(trainId);

        Map<String,Integer> seats = new LinkedHashMap<>();

        for(Coach c : coaches)
        {

            String type = c.getCoachType();
            int total = c.getTotalSeats();

            seats.put(type,seats.getOrDefault(type,0)+total);

        }

        return seats;

    }

}