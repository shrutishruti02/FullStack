package com.reg.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;
import com.reg.app.repositories.ApplicantRepository;


@Service
public class ApplicantServicesImpl implements ApplicantServices{
	
	@Autowired
	ApplicantRepository applRepository;
	
	@Autowired
	MailService sendMail;

	public List<ApplicantDetails> fetchAllApplicantsService() {
		List<ApplicantDetails> applList= applRepository.getAllApplicants();
			
		return applList;
		}
	
	public ApplicantDetails fetchApplicantByMobileService(String appMobile) throws ApplicantNotFoundException{
		ApplicantDetails appl=null;
		try{
		appl= applRepository.getApplicantByMobile(appMobile);
	}catch(ApplicantNotFoundException e) {
		throw e;
		}
		return appl;
	}
	
	/*26/05/2022
	 * public ApplicantDetails fetchApplicantByIdService(int appId) throws ApplicantNotFoundException{
		ApplicantDetails appl=null;
		try{
		appl= applRepository.getApplicantById(appId);
	}catch(ApplicantNotFoundException e) {
		throw e;
		}
		return appl;
	}*/
	
	/*public ApplicantDetails fetchApplicantByIdService(int appId) {
		ApplicantDetails appl=null;
		appl= applRepository.getApplicantById(appId);
		
	}*/
	
	
	/*public void addApplicantService(ApplicantDetails appl) {
		applRepository.insertApplicant(appl);
	}*/
	
	
	public void addApplicantService(ApplicantDetails appl) throws ApplicantAlreadyExistsException{
		try {
		applRepository.insertApplicant(appl);
		String sendMailTo=appl.getEmailId();
		
		String messageToSend="Thank You for applying with us....use following credentials to check the status of your application : " +appl.getMobile() +" as your USERNAME and  " +appl.getEmailId() +"  as your PASSWORD";
		
		sendMail.sendMail(messageToSend, sendMailTo);
		
		System.out.println("Mail has been sent to APPLICANT");
		
		
		}catch (ApplicantAlreadyExistsException e) {
			throw e;
		}
	}
	}
	
	/*public void modifyApplicantService(ApplicantDetails appl) {
		applRepository.updateApplicant(appl);
		
	}

	public void deleteApplicantByIdService(int id) {
	
		applRepository.deleteApplicantById(id);
	}*/
	




		