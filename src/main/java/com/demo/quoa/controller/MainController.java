package com.demo.quoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.service.MainService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@GetMapping(path="/user", produces= {"application/json"})
	public User getUser(@RequestParam(name="uname") String uname) throws UserNotFoundException {
		return service.getUser(uname);
	}
	
	@GetMapping(path="/questions", produces="application/json")
	public List<Question> getQuestions(@RequestParam(name="uname") String uname) throws UserNotFoundException{
		return service.getQuestions(uname);
	}
	
}
