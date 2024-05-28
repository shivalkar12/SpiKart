package com.jsp.spikart.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jsp.spikart.dto.UserDto;
import com.jsp.spikart.service.UserService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	JavaMailSender javaMailSender;

	@GetMapping({ "/", "/home" })
	public String home() {
		return "Home";
	}

	@GetMapping("/UserSignUp")
	public String UserSignUp() {
		return "UserSignUp";
	}

	@PostMapping("/UserSignUp")
	public String UserSignUpDetails(@ModelAttribute UserDto userDto, ModelMap map)
			throws UnsupportedEncodingException, MessagingException {
		userService.UserSignUpDetails(userDto);

		if (mailSender(userDto)) {
			map.put("pass", "OTP sent");
			map.put("id", userDto.getId());
			return "enter-otp";
		} else
			return "UserSignUp";
	}

	public boolean mailSender(UserDto userDto) {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		try {
			helper.setFrom("shivalkarkr.in@gmail.com", "spikart verification");
			helper.setTo(userDto.getEmail());
			helper.setSubject(" OTP verification");
			helper.setText("hello" + " " + userDto.getName() + " " + "your otp is " + " " + userDto.getOtp());

			javaMailSender.send(message);
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

	@PostMapping("/otpVerify")
	public String otpVerify(@RequestParam int id, @RequestParam int otp) {
		return userService.otpVerify(id, otp);
	}

	@GetMapping("/userLogin")
	public String loadLogin() {
		return "userLogin";
	}

	@PostMapping("/userLogin")
	public String userLogin(@RequestParam String email, @RequestParam int password, ModelMap map) {
		return userService.loginValidation(email, password, map);
	}
}
