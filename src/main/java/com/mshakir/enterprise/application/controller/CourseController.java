package com.mshakir.enterprise.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
