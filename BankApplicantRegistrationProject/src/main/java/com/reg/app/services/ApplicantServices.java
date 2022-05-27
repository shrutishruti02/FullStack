package com.reg.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;


@Service
public interface ApplicantServices {
	
List<ApplicantDetails> fetchAllApplicantsService();
	
//26052022
//ApplicantDetails fetchApplicantByIdService(int appId) throws ApplicantNotFoundException;
ApplicantDetails fetchApplicantByMobileService(String appMobile) throws ApplicantNotFoundException;

//ApplicantDetails fetchApplicantByIdService(int appId);
	
	void addApplicantService(ApplicantDetails appl) throws ApplicantAlreadyExistsException;
	//void addApplicantService(ApplicantDetails appl);
	/*void modifyApplicantService(ApplicantDetails appl);
	void deleteApplicantByIdService(int id);*/
	

}

