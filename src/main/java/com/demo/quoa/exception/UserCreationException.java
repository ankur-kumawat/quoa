package com.demo.quoa.exception;

public class UserCreationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5846020750401738005L;

	public UserCreationException() {
		super("User could not be created!");
	}

}
