package com.reg.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.app.services.MailService;


@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	MailService mailService;
	
	@RequestMapping("/send/{email}")
	public String sendMailTo(@PathVariable("email") String emailTo) {
		System.out.println("/send to "+emailTo );
		mailService.sendMail("Welcome to our Bank", emailTo);	
		return "email sent";
	}

}
