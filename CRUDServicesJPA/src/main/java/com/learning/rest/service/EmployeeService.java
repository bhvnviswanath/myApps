package com.learning.rest.service;

import java.util.Optional;

import com.learning.rest.entity.Employee;

public interface EmployeeService {
	
	
	public void addEmployee();
	public void deleteEmployee();
	public Employee getEmployeeDetails(Integer id) throws Exception;
	public void updateEmployee();
	public void getAllEmployees();
	public void getEmployeeByName();

}
