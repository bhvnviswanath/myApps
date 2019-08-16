package com.learning.rest.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.learning.rest.dao.Person;

public interface PersonsRepository extends CrudRepository<Person, Long>{
	
	Optional<Person> findById(Long id);

}
