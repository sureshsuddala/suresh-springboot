package com.in28minutes.rest.webservices.restfulwebservices.user.Exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.in28minutes.rest.webservices.restfulwebservices.user.UserNotFoundException;
@ControllerAdvice
@RestController
public class CustomisedResponceEntityExceptionHandler extends
ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) 
			throws Exception {
		
		ExceptionResponce exceptionResponce =new 
				ExceptionResponce(new Date(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity(exceptionResponce,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) 
			throws Exception {
		
		ExceptionResponce exceptionResponce =new 
				ExceptionResponce(new Date(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity(exceptionResponce,HttpStatus.NOT_FOUND);
	}
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
		ExceptionResponce exceptionResponce =new 
ExceptionResponce(new Date(),request.getDescription(false),ex.getBindingResult().toString());
		return new ResponseEntity(exceptionResponce,HttpStatus.BAD_REQUEST);
	}

}
