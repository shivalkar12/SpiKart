package com.jsp.spikart.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spikart.dto.UserDto;
import com.jsp.spikart.repository.UserRepository;

//@Component
@Repository
public class UserDao {

	@Autowired
	UserRepository userRepository;

	public String createCustomer(UserDto userDto)
	{
		userRepository.save(userDto);
		return "account created";
	}
	
	
	
	public UserDto findById(int id)
	{
		Optional<UserDto> odto=userRepository.findById(id);
		if(odto.isPresent())
		{
		return odto.get();
		}
		else {
			return null;
		}
		
	}



	public UserDto findByEmail(String email) {
		return userRepository.findByEmail(email);
	}



	public UserDto save(UserDto userDto) {
		return userRepository.save(userDto);
		
	}

}
