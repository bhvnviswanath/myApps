package com.learning.rest.entity;

import org.springframework.data.repository.CrudRepository;

import com.learning.rest.dao.Person;

public interface PersonsRepository extends CrudRepository<Person, Long>{

}
