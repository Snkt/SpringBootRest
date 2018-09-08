package com.shah.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shah.rest"})
public class SpringBootRestPostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestPostgressApplication.class, args);
	}
}
