package com.example.exception;


public class NotImplementedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotImplementedException()
	{
		super();
	}
	
	public NotImplementedException(String msg)
	{
		super(msg);
	}

}
