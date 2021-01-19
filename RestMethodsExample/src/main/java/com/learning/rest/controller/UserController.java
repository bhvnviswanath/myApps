package com.learning.rest.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learning.rest.bean.User;
import com.learning.rest.exception.UserNotFoundException;
import com.learning.rest.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String test() {
		return "Test ";
	}

	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@Valid @RequestBody User userObj) {
		User createdUser = userService.addUser(userObj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(createdUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@GetMapping("/getdetails/{uid}")
	public ResponseEntity<Object> getUser(@PathVariable("uid") int userId) {
		User retrievedUser = userService.retrieveUser(userId);
		if(retrievedUser == null)
			throw new UserNotFoundException("UserID "+ userId +" not found");
		else
		 return new ResponseEntity<Object>(retrievedUser, HttpStatus.FOUND);
	}
	
	@DeleteMapping("/removeuser/{uid}")
	public ResponseEntity<Object> removeUser(@PathVariable("uid") int userId) {
		User removedUser = userService.deleteUser(userId);
		if(removedUser == null)
			throw new UserNotFoundException("UserID "+ userId +" not found");
		else
		 return new ResponseEntity<Object>(removedUser, HttpStatus.NO_CONTENT);
	}
}
