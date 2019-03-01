package com.demo.quoa.exception;

public class InterestNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3616259767985910565L;

	public InterestNotFoundException() {
		super("Provided Interest Cound not be found");
	}


}
