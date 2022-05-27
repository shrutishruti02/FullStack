package com.reg.app.entity;



import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

	@Component
	@Entity
	@Table(name = "new_applicant")
	public class ApplicantDetails {

	//@Column(name = "applicant_id", length = 5)
	//@Column(name = "applicant_id", unique = true, nullable = false, insertable = false, updatable = false)
	//@Column(name ="applicant_id",	columnDefinition = "BIGINT(20) NOT NULL UNIQUE KEY auto_increment")
	//@GeneratedValue
	@Column(name ="applicant_id")//, columnDefinition = "BIGINT(20) NOT NULL UNIQUE KEY auto_increment")
	private int appId;

	@Column(name = "title", length = 5)
	private String title;

	@Column(name = "first_name", length = 15)
	private String firstName;

	@Column(name = "middle_name", length = 15)
	private String middleName;

	@Column(name = "last_name", length = 15)
	private String lastName;

	@Column(name = "maiden_name", length = 15)
	private String maidenName;

	@Column(name = "dob", length = 15)
	private Date dateOfBirth;

	@Column(name = "gender", length = 10)
	private String gender;

	@Column(name = "place_of_birth", length = 20)
	private String placeOfBirth;

	@Column(name = "country_of_birth", length = 20)
	private String countryOfBirth;

	@Column(name = "marital_status", length = 15)
	private String maritalStatus;

	@Column(name = "aadhar_number", length = 12)
	private String aadharNum;
	
	@Id
	@Column(name = "mobile", length = 10)
	private String mobile;

	@Column(name = "email", length = 30)
	private String emailId;

	@Column(name = "father_name", length = 30)
	private String fatherName;

	@Column(name = "mother_maiden_name", length = 30)
	private String motherName;

	@Column(name = "spouse_name", length = 30)
	private String spouseName;

	@Column(name = "id_type", length = 40)
	private String idType;

	@Column(name = "id_number", length = 20)
	private String idNumber;

	@Column(name = "id_issued_on", length = 15)
	private Date issuedOn;

	@Column(name = "pan_card", length = 10)
	private String panCard;

	@Column(name = "name_on_pan", length = 30)
	private String nameOnPAN;

	@Column(name = "address_line1", length = 40)
	private String addressLine1;

	@Column(name = "address_line2", length = 40)
	private String addressLine2;

	@Column(name = "city", length = 30)
	private String city;

	@Column(name = "state", length = 40)
	private String state;

	@Column(name = "pincode", length = 10)
	private String pincode;

	@Column(name = "country", length = 40)
	private String country;

	@Column(name = "educational_qualification", length = 20)
	private String educationalQualification;

	@Column(name = "occupation", length = 30)
	private String occupation;

	@Column(name = "annual_income", length = 15)
	private String annualIncome;

	@Column(name = "religion", length = 20)
	private String religion;

	@Column(name = "inb_rights", length = 20)
	private String inbRights;

	@Column(name = "sms", length = 20)
	private String smsAlerts;

	@Column(name = "cheque_book", length = 20)
	private String chequeBook;

	@Column(name = "debit_card", length = 20)
	private String debitCard;

	@Column(name = "name_on_card", length = 30)
	private String nameOnCard;

	@Column(name = "nominee_required", length = 20)
	private String nomineeReq;

	@Column(name = "nominee_name", length = 30)
	private String nomineeName;

	@Column(name = "nominee_relationship", length = 20)
	private String nomineeRel;

	@Column(name = "nominee_address_line1", length = 40)
	private String nomineeAddressLine1;

	@Column(name = "nominee_address_line2", length = 40)
	private String nomineeAddressLine2;

	@Column(name = "nominee_dob", length = 15)
	private Date nomineeDOB;

	@Column(name = "nominee_state", length = 20)
	private String nomineeState;

	@Column(name = "nominee_pincode", length = 15)
	private String nomineePincode;

	@Column(name = "nominee_country", length = 20)
	private String nomineeCountry;

	@Column(name = "guardian_name", length = 30)
	private String guardianName;

	@Column(name = "guardian_relation", length = 20)
	private String guardianRel;
	
	@Column(name ="status", length=20)
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		System.out.println("setAppId > "+Objects.hash(emailId, mobile));
		this.appId = hashCode();
		System.out.println("app id is : "+this.appId);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(String aadharNum) {
		this.aadharNum = aadharNum;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getIssuedOn() {
		return issuedOn;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getNameOnPAN() {
		return nameOnPAN;
	}

	public void setNameOnPAN(String nameOnPAN) {
		this.nameOnPAN = nameOnPAN;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEducationalQualification() {
		return educationalQualification;
	}

	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getInbRights() {
		return inbRights;
	}

	public void setInbRights(String inbRights) {
		this.inbRights = inbRights;
	}

	public String getSmsAlerts() {
		return smsAlerts;
	}

	public void setSmsAlerts(String smsAlerts) {
		this.smsAlerts = smsAlerts;
	}

	public String getChequeBook() {
		return chequeBook;
	}

	public void setChequeBook(String chequeBook) {
		this.chequeBook = chequeBook;
	}

	public String getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(String debitCard) {
		this.debitCard = debitCard;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public String getNomineeReq() {
		return nomineeReq;
	}

	public void setNomineeReq(String nomineeReq) {
		this.nomineeReq = nomineeReq;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRel() {
		return nomineeRel;
	}

	public void setNomineeRel(String nomineeRel) {
		this.nomineeRel = nomineeRel;
	}

	public String getNomineeAddressLine1() {
		return nomineeAddressLine1;
	}

	public void setNomineeAddressLine1(String nomineeAddressLine1) {
		this.nomineeAddressLine1 = nomineeAddressLine1;
	}

	public String getNomineeAddressLine2() {
		return nomineeAddressLine2;
	}

	public void setNomineeAddressLine2(String nomineeAddressLine2) {
		this.nomineeAddressLine2 = nomineeAddressLine2;
	}

	public Date getNomineeDOB() {
		return nomineeDOB;
	}

	public void setNomineeDOB(Date nomineeDOB) {
		this.nomineeDOB = nomineeDOB;
	}

	public String getNomineeState() {
		return nomineeState;
	}

	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}

	public String getNomineePincode() {
		return nomineePincode;
	}

	public void setNomineePincode(String nomineePincode) {
		this.nomineePincode = nomineePincode;
	}

	public String getNomineeCountry() {
		return nomineeCountry;
	}

	public void setNomineeCountry(String nomineeCountry) {
		this.nomineeCountry = nomineeCountry;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianRel() {
		return guardianRel;
	}

	public void setGuardianRel(String guardianRel) {
		this.guardianRel = guardianRel;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode is invoked...."+Objects.hash(emailId, mobile));
		return Objects.hash(emailId, mobile);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplicantDetails other = (ApplicantDetails) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(mobile, other.mobile);
	}
	
}
