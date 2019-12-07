package com.learning.rest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learning.rest.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	//List<Employee> findByEname(long id);

}
