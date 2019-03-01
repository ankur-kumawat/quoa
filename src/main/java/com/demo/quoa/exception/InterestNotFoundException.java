package com.demo.quoa.exception;

public class InterestNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3616259767985910565L;

	public InterestNotFoundException() {
		this("Provided Interest Cound not be found");
	}

	public InterestNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InterestNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InterestNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InterestNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
