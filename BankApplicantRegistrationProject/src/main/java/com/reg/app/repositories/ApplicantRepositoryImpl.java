package com.reg.app.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.reg.app.entity.ApplicantDetails;
import com.reg.app.exceptions.ApplicantAlreadyExistsException;
import com.reg.app.exceptions.ApplicantNotFoundException;


@Repository("applRepo")
public class ApplicantRepositoryImpl implements ApplicantRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	
	public ApplicantRepositoryImpl() {
		
		System.out.println("ApplicantRepositoryImpl()....");
	}
	
	public List<ApplicantDetails> getAllApplicants() {
		TypedQuery<ApplicantDetails> query = entityManager.createQuery("from ApplicantDetails", ApplicantDetails.class);
		return query.getResultList();
	}
	public ApplicantDetails getApplicantByMobile(String appMobile) throws ApplicantNotFoundException
	{
		ApplicantDetails appl=entityManager.find(ApplicantDetails.class, appMobile);
		if(appl==null) {
			throw new ApplicantNotFoundException("Applicant NOT found : "+appMobile);
		}
		return appl;
	}
	
	
	
	/*public ApplicantDetails getApplicantById(int appId) throws ApplicantNotFoundException
	{
		ApplicantDetails appl=entityManager.find(ApplicantDetails.class, appId);
		if(appl==null) {
			throw new ApplicantNotFoundException("Applicant NOT found : "+appId);
		}
		return appl;
	}*/
	
	
	/*public ApplicantDetails getApplicantById(int appId) {
		ApplicantDetails appl=entityManager.find(ApplicantDetails.class, appId);
		return appl;
	}*/
	
	/*@Transactional
	public void insertApplicant(ApplicantDetails appl) {
		entityManager.persist(appl);
	}*/
		
	@Transactional
	public void insertApplicant(ApplicantDetails appl) throws ApplicantAlreadyExistsException {
		ApplicantDetails applToInsert=entityManager.find(ApplicantDetails.class, appl.getMobile());
		if(applToInsert!=null) {
			throw new ApplicantAlreadyExistsException("Applicant already exists with Mobile Number : "+applToInsert.getMobile() +". Kindly visit nearest branch for further assistance...");
		}
		entityManager.persist(appl);
	}
	/*26/05/2022
	 * @Transactional
		public void insertApplicant(ApplicantDetails appl) throws ApplicantAlreadyExistsException {
		ApplicantDetails applToInsert=entityManager.find(ApplicantDetails.class, appl.getMobile());
		if(applToInsert!=null) {
			throw new ApplicantAlreadyExistsException("This applicant already exists!!!! : "+applToInsert.getMobile());
		}
		entityManager.persist(appl);
	
	}*/
	
	
	
	
	
	/*@Transactional
	public void updateApplicant(ApplicantDetails appl) {
		entityManager.merge(appl);
	}
	
	@Transactional
	public void deleteApplicantById(int id) {
		ApplicantDetails appl=entityManager.find(ApplicantDetails.class, id);
		entityManager.remove(appl);
	}*/
	}


