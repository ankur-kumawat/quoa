package com.demo.quoa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.quoa.exception.AnswerCreationException;
import com.demo.quoa.exception.InterestAddException;
import com.demo.quoa.exception.InterestNotFoundException;
import com.demo.quoa.exception.LikeException;
import com.demo.quoa.exception.QuestionCreationException;
import com.demo.quoa.exception.QuestionNotFoundException;
import com.demo.quoa.exception.UserCreationException;
import com.demo.quoa.exception.UserNotFoundException;
import com.demo.quoa.model.Response;

@ControllerAdvice
public class AdviceController {
	
	@ExceptionHandler(value=AnswerCreationException.class)
	public ResponseEntity<Response> handleAnswerCreationException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	@ExceptionHandler(value=InterestNotFoundException.class)
	public ResponseEntity<Response> handleInterestNotFoundException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	@ExceptionHandler(value=LikeException.class)
	public ResponseEntity<Response> handleLikeException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	@ExceptionHandler(value=QuestionCreationException.class)
	public ResponseEntity<Response> handleQuestionCreationException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	@ExceptionHandler(value=QuestionNotFoundException.class)
	public ResponseEntity<Response> handleQuestionNotFoundException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	@ExceptionHandler(value=UserCreationException.class)
	public ResponseEntity<Response> handleUserCreationException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	
	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Response> handleUserNotFoundException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	
	@ExceptionHandler(value=InterestAddException.class)
	public ResponseEntity<Response> handleInterestAddException(Throwable t){
		ResponseEntity<Response> response = new ResponseEntity<Response>(new Response("500", t.getMessage())
				, HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}
	
}
