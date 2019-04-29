package com.wunai.shop.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.wunai.shop" })
public class ShopEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopEurekaApplication.class, args);
	}

}
