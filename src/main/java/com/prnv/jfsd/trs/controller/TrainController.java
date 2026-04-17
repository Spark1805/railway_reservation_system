package com.prnv.jfsd.trs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prnv.jfsd.trs.dto.TrainSearchResponse;
import com.prnv.jfsd.trs.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainController
{

    @Autowired
    private TrainService trainService;

    @GetMapping("/search")
    public List<TrainSearchResponse> searchTrains(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date)
    {
        return trainService.searchTrains(from,to,date);
    }

}