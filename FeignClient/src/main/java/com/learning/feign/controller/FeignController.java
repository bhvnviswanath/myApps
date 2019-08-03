package com.learning.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.feign.common.FeignClientInterface;

@RestController
public class FeignController {

	@Autowired
	FeignClientInterface feignClientInterface;

	@GetMapping("/call")
	public String callGetMethod() {
		return "****************** :: "+feignClientInterface.getDetails();

	}
}
