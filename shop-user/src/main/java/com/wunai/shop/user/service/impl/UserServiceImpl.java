package com.wunai.shop.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.wunai.shop.user.business.UserBO;
import com.wunai.shop.user.mybatis.UserServiceMapper;
import com.wunai.shop.user.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserServiceMapper userServiceMapper;

	@Override
	public boolean login(String userName, String password) {
		UserBO user = userServiceMapper.findByUserName(userName);
		return user.getPassword().equals(password);
	}

}
