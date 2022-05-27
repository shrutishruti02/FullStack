package com.reg.app;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;
import com.reg.app.repositories.ApplicantRepository;
import com.reg.app.repositories.ApplicantRepositoryImpl;


@SpringBootTest
public class ApplicantRepositoryTesting {

	@Autowired
	ApplicantRepository appRepository;
	
	
	/*@Test
	public void testGetApplicantById() throws ApplicantNotFoundException {
	
		ApplicantDetails appl=appRepository.getApplicantById(1);
		System.out.println("test get applicant by id case is running.....");
		System.out.println("Applicant Id: "+appl.getAppId());
		System.out.println("Applicant first name: "+appl.getFirstName());
		System.out.println("Applicant middle name: "+appl.getMiddleName());
		System.out.println("Applicant last name: "+appl.getLastName());
	
	}}*/
	

/*	@Test
	public void testGetAllApplicant() {
		
		List<ApplicantDetails> appDetails = appRepository.getAllApplicants();
		for (ApplicantDetails applicant : appDetails) {
			System.out.println("APPLICANT_ID : "+applicant.getAppId());
			System.out.println("ACCOUNT_TYPE  : "+applicant.getAccType());
			System.out.println("TITLE : " +applicant.getTitle());
			System.out.println("FIRST_NAME: "+applicant.getFirstName());
			
			System.out.println("=========================");
	
	}
}*/
	/*@Test
	public void testInsertApplicant() throws ApplicantAlreadyExistsException {
		System.out.println("inserting applicant: ");
		ApplicantDetails appl=new ApplicantDetails();
		
		appl.setTitle(null);
		appl.setFirstName("Raj");
		appl.setMiddleName("Kumar");
		appl.setLastName("Dev");
		appl.setGender("Male");
		appl.setMaritalStatus("Married");
		appl.setReligion("Hindu");
		appl.setFatherName("Ajay");
		appl.setMotherName("Disha");
		appl.setSpouseName("Reeta");
		appl.setIdType("Passport");
		appl.setIdNumber("125");
		appl.setPanCard("AAOP111289");
		
		appRepository.insertApplicant(appl);
	}*/
	
	
}
	/*@Test
	public void testSelectAllApplicant() {
		System.out.println("test select all case is running.....");
		
		List<ApplicantDetails> baList = entityManager.
		for (ApplicantDetails bankApplicant : baList) {
			System.out.println("BankApplicant Name "+bankApplicant.getApplicantName());
		}
		System.out.println("-----------");
		
	
	}*/
	
	/*
	public ApplicantDetails getApplicantById(int id)
	{
		return entityManager.find(ApplicantDetails.class, id);
	}*/
	
