package com.learning.rest.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Persons")
@Data
public class Person {

	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="Age")
	private int age;
}
