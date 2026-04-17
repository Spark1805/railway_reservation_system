package com.prnv.jfsd.trs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prnv.jfsd.trs.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>
{

    int countByScheduleId(Long scheduleId);

    List<Ticket> findByUserId(Long userId);

    Ticket findByPnrNumber(String pnrNumber);

}