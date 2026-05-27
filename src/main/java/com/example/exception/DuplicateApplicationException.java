package com.example.exception;

public class DuplicateApplicationException extends RuntimeException {

	public DuplicateApplicationException(String msg) {

		super(msg);
	}
}