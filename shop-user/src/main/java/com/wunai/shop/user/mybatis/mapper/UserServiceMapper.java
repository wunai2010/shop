package com.wunai.shop.user.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wunai.shop.user.business.UserBO;

@Mapper
public interface UserServiceMapper {
	List<UserBO> query(UserBO user);

	UserBO findByUserName(String userName);
}
