package com.prnv.jfsd.trs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule,Long>
{

    List<Schedule> findByTrainId(Long trainId);

}