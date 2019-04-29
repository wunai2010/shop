package com.wunai.shop.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Value("${spring.application.name}")
	private String test;

	@GetMapping("/ok")
	public String ok() {
		return test;
	}

}
