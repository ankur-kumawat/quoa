package com.demo.quoa.service;

import java.util.List;

import com.demo.quoa.entities.Answer;
import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.AnswerCreationException;
import com.demo.quoa.exception.InterestNotFoundException;
import com.demo.quoa.exception.QuestionCreationException;
import com.demo.quoa.exception.QuestionNotFoundException;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.model.Response;

public interface MainService {

	User getUser(String uname) throws UserNotFoundException;

	List<Question> getQuestions(String uname) throws UserNotFoundException;

	Response createQuestion(Question question, String interest) throws InterestNotFoundException, QuestionCreationException;

	Response createAnswer(Answer answer, Integer questionId) throws QuestionNotFoundException, AnswerCreationException;

}
