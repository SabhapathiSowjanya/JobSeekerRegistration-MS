package com.service.Exception;

public class EmailNotEmpty extends RuntimeException{
	public EmailNotEmpty(String message) {
		super(message);
	}

}