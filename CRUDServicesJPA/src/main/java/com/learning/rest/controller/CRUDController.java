package com.learning.rest.controller;

import java.util.List;

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

	//	System.out.println("Total Count is :: " + employeeRepository.count());
	}

	@GetMapping("/getEmployeeDetails/{id}") public List<Employee>
	  getDetailsById(@PathVariable("id") long id) 
	{ 
		List<Employee> EmployeeDetails = employeeService.getEmployeeDetails(); 
		return null;
		
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
