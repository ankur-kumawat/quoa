package com.demo.quoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping(path="/user", produces= {"application/json"})
	public User getUser(@RequestParam(name="uname") String uname) throws UserNotFoundException {
		return service.getUser(uname);
	}
	
}
