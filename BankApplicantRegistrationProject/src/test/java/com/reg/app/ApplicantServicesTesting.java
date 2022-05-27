package com.reg.app;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantNotFoundException;
import com.reg.app.repositories.ApplicantRepository;
import com.reg.app.services.ApplicantServices;
import com.reg.app.services.ApplicantServicesImpl;

@SpringBootTest
public class ApplicantServicesTesting {
	

	@Autowired
	ApplicantServices appServices;
	
	@Test
	public void testFetchApplicantByIdServices() throws ApplicantNotFoundException {
	
		ApplicantDetails appl=appServices.fetchApplicantByMobileService("9865874812");
		System.out.println("test get applicant by Mobile case is running.....");
		System.out.println("Applicant Id: "+appl.getAppId());
		System.out.println("Applicant first name: "+appl.getFirstName());
		System.out.println("Applicant middle name: "+appl.getMiddleName());
		System.out.println("Applicant last name: "+appl.getLastName());
	}
	}
	/*@Test
	public void testFetchApplicantByIdServices() {
	
		ApplicantDetails appl=appServices.fetchApplicantByIdService(1);
		System.out.println("test get applicant by id case is running.....");
		System.out.println("Applicant Id: "+appl.getAppId());
		System.out.println("Applicant first name: "+appl.getFirstName());
		System.out.println("Applicant middle name: "+appl.getMiddleName());
		System.out.println("Applicant last name: "+appl.getLastName());
	
	}*/
	

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
/*	@Test
	public void testAddApplicantServices() {
		System.out.println("inserting applicant: ");
		ApplicantDetails appl=new ApplicantDetails();
		appl.setAppId(4);
		appl.setAccType("Current");
		appl.setTitle("Mr");
		appl.setFirstName("Neelkamal");
		appl.setMiddleName("Kumar");
		appl.setLastName("Devgan");
		appl.setDob(Date.valueOf("1994-12-05"));
		appl.setGender("Male");
		appl.setMaritalStatus("Married");
		appl.setReligion("Hindu");
		appl.setFatherName("Neelesh");
		appl.setMotherName("Dipti");
		appl.setSpouseName("Teena");
		appl.setIdType("Passport");
		appl.setIdNumber("228");
		appl.setPanCard("SOYL7112EH");
		appl.setMobile(9144941);
		appl.setEmail("neel@123");
		appl.setAddress("2N Street New Delhi");
		appl.setNomineeName("Priyam");
		appl.setNomineeRelationship("Son");
		appl.setNomineeDob(Date.valueOf("2000-11-14"));
		appl.setNomineeAddress("2N Street New Delhi");
		appl.setGuardianName("Reeta");
		appl.setGuardianAddress("2P Street New Delhi");
		appl.setEduQualification("Graduate");
		appl.setOccType("PSU");
		appl.setAnnualIncome(700000);
		
		appServices.addApplicantService(appl);
	}
}*/