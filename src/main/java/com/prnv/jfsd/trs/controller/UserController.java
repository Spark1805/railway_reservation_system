package com.prnv.jfsd.trs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prnv.jfsd.trs.entity.Ticket;
import com.prnv.jfsd.trs.repository.TicketRepository;

@RestController
@RequestMapping("/user")
public class UserController
{

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/bookings/{userId}")
    public List<Ticket> bookingHistory(@PathVariable Long userId)
    {

        return ticketRepository.findByUserId(userId);

    }

}