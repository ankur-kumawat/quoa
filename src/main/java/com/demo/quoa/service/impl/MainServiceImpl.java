package com.demo.quoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.repos.QuestionRepository;
import com.demo.quoa.repos.UserRepository;
import com.demo.quoa.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	UserRepository uRepo;
	
	@Autowired
	QuestionRepository qRepo;

	@Override
	public User getUser(String uname) throws UserNotFoundException {
		return uRepo.findById(uname).orElseThrow(()->new UserNotFoundException());
	}

	@Override
	public List<Question> getQuestions(String uname) throws UserNotFoundException {
		User user = uRepo.findById(uname).orElseThrow(()->new UserNotFoundException());
		List<Question> questions = qRepo.findAllOrderByInterest(user.getInterests());
		return questions;
	}

}
