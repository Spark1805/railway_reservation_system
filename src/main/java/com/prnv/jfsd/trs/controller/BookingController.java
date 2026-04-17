package com.prnv.jfsd.trs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prnv.jfsd.trs.dto.BookingRequest;
import com.prnv.jfsd.trs.dto.BookingResponse;
import com.prnv.jfsd.trs.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController
{

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public BookingResponse createBooking(@RequestBody BookingRequest request)
    {
        return bookingService.bookTicket(request);
    }

}