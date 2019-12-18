package com.learning.rest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Optional<Employee>> getDetailsById(@PathVariable("id") Integer id) {
			Optional<Employee> employeeDetailsObj = employeeService.getEmployeeDetails(id);
			
		return new ResponseEntity<Optional<Employee>>(employeeDetailsObj, HttpStatus.OK);
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
