package com.demo.quoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.quoa.entities.Answer;
import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.AnswerCreationException;
import com.demo.quoa.exception.InterestNotFoundException;
import com.demo.quoa.exception.QuestionCreationException;
import com.demo.quoa.exception.QuestionNotFoundException;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.model.Response;
import com.demo.quoa.service.MainService;

@RestController
@RequestMapping("/api")
public class MainController {
	
	@Autowired
	MainService service;
	
	@GetMapping(path="/user", produces= {"application/json"})
	public User login(@RequestParam(name="uname") String uname) throws UserNotFoundException {
		return service.getUser(uname);
	}
	
	@GetMapping(path="/questions", produces="application/json")
	public List<Question> getQuestions(@RequestParam(name="uname") String uname) throws UserNotFoundException{
		return service.getQuestions(uname);
	}
	
	@PostMapping(path="/question", produces="application/json")
	public Response createQuestion(@RequestBody Question question,
			@RequestParam(name="interest") String interest) throws InterestNotFoundException, QuestionCreationException {
		return service.createQuestion(question, interest);
	}
	
	@PostMapping(path="/answer", produces="application/json")
	public Response createAnswer(@RequestBody Answer answer, Integer questionId) throws QuestionNotFoundException, AnswerCreationException {
		return service.createAnswer(answer, questionId);
	}
	
}
