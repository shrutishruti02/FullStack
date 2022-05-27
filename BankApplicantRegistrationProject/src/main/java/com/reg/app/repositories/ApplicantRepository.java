package com.reg.app.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;

@Repository
public interface ApplicantRepository {
	
	public List<ApplicantDetails> getAllApplicants();
	//ApplicantDetails getApplicantById(int appId) throws ApplicantNotFoundException;
	
	ApplicantDetails getApplicantByMobile(String appMobile) throws ApplicantNotFoundException;
	
	//ApplicantDetails getApplicantById(int appId);
	void insertApplicant(ApplicantDetails appl) throws ApplicantAlreadyExistsException;
	//void insertApplicant(ApplicantDetails appl);
	/*void updateApplicant(ApplicantDetails appl);
	void deleteApplicantById(int id);*/

}




