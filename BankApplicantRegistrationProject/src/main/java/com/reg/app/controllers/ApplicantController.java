package com.reg.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.entity.MyStatus;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;
import com.reg.app.services.ApplicantServices;

@CrossOrigin
@RestController
@RequestMapping("/appl")
public class ApplicantController {
	
	@Autowired
	ApplicantServices applService;
	
	@RequestMapping("/welcome")
	public String greet() { //http:localhost:8080/appl/welcome
		System.out.println("ApplicantController: greet() is invoked..");
		return "<h1>Welcome to Applicant Controller</h1>";
		
	}
		@RequestMapping("/all")
		public List<ApplicantDetails> allApplicants() { //http:localhost:8080/appl/all
			System.out.println("ApplicantController: allApplicants() is invoked..");
			return  applService.fetchAllApplicantsService();
		
	}
		
		@RequestMapping("/{applMob}")
		public ApplicantDetails findSingleAppl(@PathVariable("applMob") String appMobile) throws ApplicantNotFoundException { 
		  ApplicantDetails appl=null;
		  try {
		System.out.println("ApplicantController: findSingleDept(int) is invoked....");
		  appl= applService.fetchApplicantByMobileService(appMobile);
		}catch (ApplicantNotFoundException e) {
			throw e;}
		  return appl;
		}
		/*26052022
		 * @RequestMapping("/{applno}")
		public ApplicantDetails findSingleAppl(@PathVariable("applno") int applno) throws ApplicantNotFoundException { 
		  ApplicantDetails appl=null;
		  try {
			System.out.println("ApplicantController: findSingleDept(int) is invoked....");
		  appl= applService.fetchApplicantByIdService(applno);
		}catch (ApplicantNotFoundException e) {
			throw e;}
		  return appl;
		}*/
		
		/*@RequestMapping("/{applno}")
		public ApplicantDetails findSingleAppl(@PathVariable("applno") int applno) {
		  ApplicantDetails appl=null;
		 
			System.out.println("ApplicantController: findSingleDept(int) is invoked....");
		  appl= applService.fetchApplicantByIdService(applno);
		
		  return appl;
		}*/
		
		
		/*@PostMapping("/addappl")
		public void addNewApplicant(@RequestBody ApplicantDetails applBody) { 
		  System.out.println("ApplicantController:addNewApplicant(Applicant)...invoked.");
		  applService.addApplicantService(applBody);
		}*/
		
				
		@PostMapping("/addappl")
		public MyStatus addNewApplicant(@RequestBody ApplicantDetails applBody) throws ApplicantAlreadyExistsException {
			System.out.println("ApplicantController:addNewApplicant(Applicant)");
			try {
			applService.addApplicantService(applBody);
		}catch (ApplicantAlreadyExistsException e) {
			
			throw e;
			}
			
			MyStatus myStatus = new MyStatus();
			myStatus.setMessage("Applicant successfully added");
			return myStatus;
		}
		
		
		
	/*	@PutMapping("/updateappl")
		public void updateExistingApplicant(@RequestBody ApplicantDetails applBody) {
			System.out.println("ApplicantController:updateExistingApplicant(Applicant)");
			applService.modifyApplicantService(applBody);
		}
		@DeleteMapping("/deleteDept/{dno}")
		public void deleteExistingApplicant(@PathVariable("dno") int applNoToDelete) {
			System.out.println("ApplicantController:deleteExistingApplicant(Applicant)");
			applService.deleteApplicantByIdService(applNoToDelete);
		}*/
	

}
