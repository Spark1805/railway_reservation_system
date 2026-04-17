package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.Coach;

import java.util.List;

public interface CoachRepository extends JpaRepository<Coach,Long>
{
    List<Coach> findByTrainId(Long trainId);
}