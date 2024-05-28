package com.jsp.spikart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spikart.dto.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Integer>{

	UserDto findByEmail(String email);

}
