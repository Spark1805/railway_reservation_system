package com.prnv.jfsd.trs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prnv.jfsd.trs.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}