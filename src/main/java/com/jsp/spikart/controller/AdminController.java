package com.jsp.spikart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsp.spikart.dto.AdminDto;
import com.jsp.spikart.service.AdminService;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;

	@GetMapping("/admins")
	public String admin() {
		return "adminsignup";
	}
	
	
	@PostMapping("/admin")
	public String createAccount(@ModelAttribute AdminDto adminDto)
	{
		return adminService.createAccount(adminDto);
	}

}
