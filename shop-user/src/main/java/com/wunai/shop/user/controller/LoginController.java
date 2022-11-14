package com.wunai.shop.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wunai.shop.user.service.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public boolean login(@RequestParam String userName, @RequestParam String password) {
		return userService.login(userName, password);
	}

	public void ok(){

	}

}
