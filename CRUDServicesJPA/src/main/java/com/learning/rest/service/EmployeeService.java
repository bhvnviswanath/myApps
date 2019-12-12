package com.learning.rest.service;

import com.learning.rest.entity.Employee;

public interface EmployeeService {
	
	
	public void addEmployee();
	public void deleteEmployee();
	public Iterable<Employee> getEmployeeDetails(Integer id);
	public void updateEmployee();
	public void getAllEmployees();
	public void getEmployeeByName();

}
