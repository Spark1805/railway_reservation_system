package com.prnv.jfsd.trs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prnv.jfsd.trs.entity.Ticket;
import com.prnv.jfsd.trs.repository.TicketRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController
{

    @Autowired
    private TicketRepository ticketRepository;

    @DeleteMapping("/{pnr}")
    public String cancelTicket(@PathVariable String pnr)
    {

        Ticket ticket = ticketRepository.findByPnrNumber(pnr);

        if(ticket == null)
        {
            return "Ticket not found";
        }

        ticket.setStatus("CANCELLED");

        ticketRepository.save(ticket);

        return "Ticket cancelled successfully";

    }

}