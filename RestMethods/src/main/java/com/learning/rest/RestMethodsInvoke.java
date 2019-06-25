package com.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class RestMethodsInvoke {

	@GetMapping(value="/hello")
	public void sayHello() {
		System.out.println("Hellooooooooooooooo");
	}

}
