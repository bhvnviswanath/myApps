package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testservice")
public class TestController {
	
	@GetMapping("/hello")
	public String sayHello(String params) {
		return "Hello !!!!!!!!!!!!";
	}

}
