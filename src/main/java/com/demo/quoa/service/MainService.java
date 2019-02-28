package com.demo.quoa.service;

import java.util.List;

import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.UserNotFoundException;

public interface MainService {

	User getUser(String uname) throws UserNotFoundException;

	List<Question> getQuestions(String uname) throws UserNotFoundException;

}
