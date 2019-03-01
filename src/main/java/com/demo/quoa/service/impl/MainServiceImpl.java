package com.demo.quoa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.quoa.entities.Answer;
import com.demo.quoa.entities.Interest;
import com.demo.quoa.entities.Like;
import com.demo.quoa.entities.Question;
import com.demo.quoa.entities.User;
import com.demo.quoa.exception.AnswerCreationException;
import com.demo.quoa.exception.InterestNotFoundException;
import com.demo.quoa.exception.LikeException;
import com.demo.quoa.exception.QuestionCreationException;
import com.demo.quoa.exception.QuestionNotFoundException;
import com.demo.quoa.exception.UserCreationException;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.model.Response;
import com.demo.quoa.repos.AnswerRepository;
import com.demo.quoa.repos.InterestRepository;
import com.demo.quoa.repos.LikeRepository;
import com.demo.quoa.repos.QuestionRepository;
import com.demo.quoa.repos.UserRepository;
import com.demo.quoa.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	UserRepository uRepo;
	
	@Autowired
	QuestionRepository qRepo;
	
	@Autowired
	InterestRepository iRepo;
	
	@Autowired
	AnswerRepository aRepo;
	
	@Autowired
	LikeRepository lRepo;

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

	@Override
	public Response createQuestion(Question question, String interestName) throws InterestNotFoundException, QuestionCreationException {
		Interest interest =  iRepo.findByName(interestName).orElseThrow(()-> new InterestNotFoundException());
		question.setInterest(interest);
		question = qRepo.saveAndFlush(question);
		if(question.getId() == null) {
			throw new QuestionCreationException();
		}
		Response response = new Response("200 OK!", "Question Created Successfuly");
		return response;
	}

	@Override
	public Response createAnswer(Answer answer, Integer questionId) throws QuestionNotFoundException, AnswerCreationException {
		Question question = qRepo.findById(questionId).orElseThrow(()->
				new QuestionNotFoundException());
		answer.setQuestion(question);
		answer = aRepo.saveAndFlush(answer);
		if(answer.getId() == null) {
			throw new AnswerCreationException();
		}
		Response response = new Response("200 OK!", "Answer added successfuly");
		return response;
	}

	@Override
	public Response addUpdateLike(Like like, String uname, Integer questionId) throws LikeException, 
			UserNotFoundException, QuestionNotFoundException{
		User user = uRepo.findById(uname).orElseThrow(()->
				new UserNotFoundException());
		Question question = qRepo.findById(questionId).orElseThrow(
				()-> new QuestionNotFoundException());
		like.setQuestion(question);
		like.setUser(user);
		like = lRepo.saveAndFlush(like);
		if(like.getId() == null) {
			throw new LikeException();
		}
		Response response = new Response("200 OK!", "Like added successfuly");
		return response;
	}

	@Override
	public Question getQuestion(Integer questionId) throws QuestionNotFoundException {
		Question question = qRepo.findById(questionId).orElseThrow(
				()-> new QuestionNotFoundException());
		return question;
	}

	@Override
	public Response createUser(User user) throws UserCreationException {
		user = uRepo.saveAndFlush(user);
		if(user.getUname() == null || user.getUname().length() == 0) {
			throw new UserCreationException();
		}
		Response response = new Response("200 OK!", "User created successfuly");
		return response;
	}

}
