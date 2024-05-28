package com.jsp.spikart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jsp.spikart.dao.AdminDao;
import com.jsp.spikart.dto.AdminDto;

@Service
public class AdminService {
	@Autowired
	AdminDao adminDao;
	
	public String createAccount(AdminDto adminDto)
	{
	  return adminDao.createAccount(adminDto);
	}

}
