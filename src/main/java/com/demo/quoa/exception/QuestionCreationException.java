package com.demo.quoa.exception;

public class QuestionCreationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8328772967458199138L;

	public QuestionCreationException() {
		this("Question Cound not be created!");
	}

	public QuestionCreationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
