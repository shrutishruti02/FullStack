package com.reg.app.services;

import org.springframework.stereotype.Service;

@Service
public interface MailService {
	public void sendMail(String info, String email);

}
