package com.learning.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.entity.Employee;
import com.learning.rest.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CRUDController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/add")
	public String getDetails() {
		return "Succesfully Addeddddddddddddddddddddddddddd";
	}

	@GetMapping("/getCount")
	public void getCount() {

	}

	@GetMapping("/getEmployeeDetails/{id}")
	
	public Iterable<Employee> getDetailsById(@PathVariable("id") Integer id) {
		System.out.println("In COntroller");
		//Optional<Employee> EmployeeDetails = employeeService.getEmployeeDetails(id);
		return employeeService.getEmployeeDetails(id);

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
