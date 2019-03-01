package com.demo.quoa.exception;

public class QuestionNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2815559131438972504L;

	public QuestionNotFoundException() {
		this("Question could not be found!");
	}

	public QuestionNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
