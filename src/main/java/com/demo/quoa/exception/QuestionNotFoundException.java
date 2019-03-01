package com.demo.quoa.exception;

public class QuestionNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2815559131438972504L;

	public QuestionNotFoundException() {
		super("Question could not be found!");
	}

}
