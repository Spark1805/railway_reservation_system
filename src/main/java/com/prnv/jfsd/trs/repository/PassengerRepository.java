package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>
{

}