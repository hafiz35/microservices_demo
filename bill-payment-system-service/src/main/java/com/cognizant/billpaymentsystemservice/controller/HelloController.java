package com.cognizant.billpaymentsystemservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellobill")
public class HelloController {

	@GetMapping
	String hello() {
		return "Hello from Bill Payment System Service";
	}
	
}
