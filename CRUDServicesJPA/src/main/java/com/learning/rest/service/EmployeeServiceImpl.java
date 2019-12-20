package com.learning.rest.service;

import java.util.Optional;

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
	public Employee getEmployeeDetails(Integer id) throws Exception{
		return employeeRepository.findById(id).orElseThrow(
			    () -> new Exception("User not found with userId " + id));
		
		//return employeeRepository.findById(id);
	}

}
