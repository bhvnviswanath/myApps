package com.learning.rest.service;

import java.util.List;

import com.learning.rest.entity.Employee;

public interface EmployeeService {
	
	
	public void addEmployee();
	public void deleteEmployee();
	public List<Employee> getEmployeeDetails();
	public void updateEmployee();
	public void getAllEmployees();
	public void getEmployeeByName();

}
