package com.wunai.shop.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wunai.shop.user.business.UserBO;
import com.wunai.shop.user.result.Result;
import com.wunai.shop.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserManagerController {

	@Autowired
	private UserService userService;

	@GetMapping("/list")
	public Result<List<UserBO>> list() {
		return new Result<>(userService.search());
	}

}
