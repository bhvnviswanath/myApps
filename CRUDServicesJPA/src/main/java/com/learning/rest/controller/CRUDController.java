package com.learning.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.dao.Person;
import com.learning.rest.repository.EmployeeRepository;
import com.learning.rest.repository.PersonsRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CRUDController {

	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping("/add")
	public String getDetails() {
		return "Succesfully Addeddddddddddddddddddddddddddd";
	}

	@GetMapping("/getCount")
	public void getCount() {

		System.out.println("Total Count is :: " + employeeRepository.count());
	}

	/*
	 * @GetMapping("/getPersonDetails/{id}") public List<Person>
	 * getDetailsById(@PathVariable("id") long id) { Optional<Person> personDetails
	 * = personsRepository.findById(id); personDetails.
	 * 
	 * personsRepository. return personDetails; }
	 */

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
