package com.learning.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CRUDController {

	@GetMapping("/add")
	public String getDetails() {
		return "Succesfully Addeddddddddddddddddddddddddddd";
	}
	
	public void getAllDetails() {
		
	}
	
	public void getDetailsByName() {
		
	}
	
	
	public void updateDetails() {
		
	}
	
	public void deleteByName() {
		
	}
	
	public void deletAllDetails() {
		
	}
	
	public void getMultipleDetails() {
		
	}
}
