package com.reg.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicantNotFoundAdvice {
	

	@ResponseBody
	@ExceptionHandler(ApplicantNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String applicantNotFoundHandler(ApplicantNotFoundException ex)
	{
		System.out.println("applicantNotFoundHandler is running.....");
		return ex.getMessage() + " its not there, means 404";
	}

}
