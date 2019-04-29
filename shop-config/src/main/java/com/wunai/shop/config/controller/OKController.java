package com.wunai.shop.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OKController {

	@GetMapping("/ok")
	public String ok() {
		return "ok";
	}

}
