package com.reg.app.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ApplicantAlreadyExistsAdvice {

	@ResponseBody
	@ExceptionHandler(ApplicantAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String applicantAlreadyExistsHandler(ApplicantAlreadyExistsException ex)
	{
		System.out.println("applicantAlreadyExistsHandler is running.....");
		return ex.getMessage() + " ";
	}

}
