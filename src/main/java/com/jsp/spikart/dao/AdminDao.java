package com.jsp.spikart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jsp.spikart.dto.AdminDto;
import com.jsp.spikart.repository.AdminRepository;

@Repository
public class AdminDao {
@Autowired
AdminRepository adminRepository; 
	
	public String createAccount(AdminDto adminDto)
	{
		adminRepository.save(adminDto);
		return "account created";
	}
	
	

}
