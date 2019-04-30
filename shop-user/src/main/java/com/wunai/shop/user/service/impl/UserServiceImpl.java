package com.wunai.shop.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wunai.shop.user.business.UserBO;
import com.wunai.shop.user.mybatis.mapper.UserServiceMapper;
import com.wunai.shop.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserServiceMapper userServiceMapper;

	@Override
	public boolean login(String userName, String password) {
		UserBO user = userServiceMapper.findByUserName(userName);
		return user.getPassword().equals(password);
	}

	@Override
	public List<UserBO> search() {
		return userServiceMapper.query(null);
	}

}
