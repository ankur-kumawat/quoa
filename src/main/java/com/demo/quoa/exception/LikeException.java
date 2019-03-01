package com.demo.quoa.exception;

public class LikeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7245642899992534581L;

	public LikeException() {
		super("Like could not be added or updated!");
	}
}
