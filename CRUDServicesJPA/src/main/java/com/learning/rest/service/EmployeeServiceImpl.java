package com.learning.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.rest.entity.Employee;
import com.learning.rest.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void addEmployee() {

	}

	@Override
	public void deleteEmployee() {

	}

	@Override
	public List<Employee> getEmployeeDetails() {
		
		//employeeRepository.findEmployeeByID();
		return null;

	}

	@Override
	public void updateEmployee() {

	}

	@Override
	public void getAllEmployees() {

	}

	@Override
	public void getEmployeeByName() {

	}

}
