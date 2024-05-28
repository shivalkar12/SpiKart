package com.jsp.spikart.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.jsp.spikart.dao.UserDao;
import com.jsp.spikart.dto.UserDto;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public void UserSignUpDetails(UserDto userDto) {
		int otp = new Random().nextInt(1000, 9999);
		userDto.setOtp(otp);
		userDao.save(userDto);
	}

	public String otpVerify(int id, int otp) {
		UserDto user = userDao.findById(id);
		if (user.getOtp() == otp) {
			return "userLogin";
		}
		return "enter-otp";
	}

	public String loginValidation(String email, int password, ModelMap map) {
		UserDto user = userDao.findByEmail(email);
		if (user != null) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "home";
			} else {
				map.put("neg", "invalid email or password");
				return "userLogin";
			}
		} else {
			map.put("neg", "incorrect validation");
			return "userLogin";
		}
	}
}
