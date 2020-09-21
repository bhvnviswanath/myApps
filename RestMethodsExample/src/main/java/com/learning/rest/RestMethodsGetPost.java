package com.learning.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class RestMethodsGetPost {

	@GetMapping("/hello")
	public String sayHello(String params) {
		return "Hello !!!!!!!!!!!!";
	}

	@GetMapping("/query")
	public String getRequestParamEx1(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("orderBy") List<String> orderBy) {
		return "FROM " + from + " TO " + to + " OrderBy " + orderBy.size();
	}

	
	@PostMapping("/query")
	public String getRequestParamEx2(@RequestParam("from") String from, @RequestParam("to") String to,
			@RequestParam("orderBy") List<String> orderBy) {
		return "FROM " + from + " TO " + to + " OrderBy " + orderBy.size();
	}
	
	@PostMapping("/users")
	public String getdetails() {
		return "This is get Method";
	}
	
	
}
