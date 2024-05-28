package com.jsp.spikart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spikart.dto.AdminDto;

public interface AdminRepository extends JpaRepository<AdminDto, Integer> {

}
