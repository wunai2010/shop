package com.wunai.shop.user.service;

import java.util.List;

import com.wunai.shop.user.business.UserBO;

public interface UserService {
	public boolean login(String userName, String password);

	public List<UserBO> search();
}
