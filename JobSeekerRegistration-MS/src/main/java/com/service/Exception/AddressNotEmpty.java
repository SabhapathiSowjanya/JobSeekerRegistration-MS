package com.service.Exception;

public class AddressNotEmpty extends RuntimeException{
	public AddressNotEmpty(String message) {
		super(message);
	}

}