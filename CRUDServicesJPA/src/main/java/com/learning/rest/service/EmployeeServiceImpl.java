package com.learning.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.rest.entity.Employee;
import com.learning.rest.repository.EmployeeRepository;

@Service
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
	public void updateEmployee() {

	}

	@Override
	public void getAllEmployees() {

	}

	@Override
	public void getEmployeeByName() {

	}

	@Override
	public Iterable<Employee> getEmployeeDetails(Integer id) {
		System.out.println("In Service Class");
		return employeeRepository.findAll();
		
		//return employeeRepository.findById(id);
	}

}
