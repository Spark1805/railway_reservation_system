package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.Train;

public interface TrainRepository extends JpaRepository<Train, Long>
{
	
}
