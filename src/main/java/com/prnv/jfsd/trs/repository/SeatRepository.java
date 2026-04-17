package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.Seat;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat,Long>
{
    List<Seat> findByCoachId(Long coachId);
}