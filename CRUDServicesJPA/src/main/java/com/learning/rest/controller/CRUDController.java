package com.learning.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.rest.entity.PersonsRepository;
import com.mysql.cj.log.Log;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CRUDController {

	@Autowired
	PersonsRepository personsRepository;

	@GetMapping("/add")
	public String getDetails() {
		return "Succesfully Addeddddddddddddddddddddddddddd";
	}

	@GetMapping("/getCount")
	public void getCount() {

		System.out.println("Total Count is :: " + personsRepository.count());
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
