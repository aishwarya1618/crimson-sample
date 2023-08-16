package com.crimsonlogic.inventroymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crimsonlogic.inventroymanagementsystem.entity.Admin;
import com.crimsonlogic.inventroymanagementsystem.repository.IAdminRepository;

@RestController
@RequestMapping("/admin")
public class AdminController{
@Autowired
private IAdminRepository adminRepo;

 

@PostMapping
public Admin insertAdmin(@RequestBody Admin admin) {
	return null;
}
}
