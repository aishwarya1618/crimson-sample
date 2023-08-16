package com.crimsonlogic.inventroymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.crimsonlogic.inventroymanagementsystem.entity.Admin;


 

@Repository

public interface IAdminRepository extends JpaRepository<Admin, Integer> {

 

}

