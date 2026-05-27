package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DuplicateApplicationException.class)

	public ResponseEntity<String> handleDuplicateApplication(DuplicateApplicationException ex) {

		return ResponseEntity.status(HttpStatus.BAD_REQUEST)

				.body(ex.getMessage());
	}

	@ExceptionHandler(Exception.class)

	public ResponseEntity<String> handleGeneric(Exception ex) {

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)

				.body(ex.getMessage());
	}
}