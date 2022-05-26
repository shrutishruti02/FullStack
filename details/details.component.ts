import { Component, OnInit } from '@angular/core';

import { FormControl, FormGroup, FormGroupDirective, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {ThemePalette } from '@angular/material/core';
import { Details } from './details';
import { ApplicantService } from '../applicant.service';
import { MyStatus } from '../MyStatus';



@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})

export class DetailsComponent implements OnInit {
  
  detailsObj: Details = new Details();
  appDetails:Details[]=[];

  links = ['Personal Details', 'KYC Details', 'Address Details','Additional Details','Nomination Details','Services Required','Submit'];
  activeLink = this.links[0];
  active=0;
  message!: string;

  selected = new FormControl(0);
  background: ThemePalette =  'primary';

  myForm!: FormGroup;
 
  toggleBackground() {
    this.background = this.background ? undefined : 'primary';
  }
  constructor(private router:Router,
    private applicantService:ApplicantService) { }
   
   //panCardPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

   onClickSubmit(result:any) {
    this.detailsObj.firstName = result.firstName;
    this.detailsObj.middleName=result.middleName;
    this.detailsObj.lastName=result.lastName;
    this.detailsObj.maidenName=result.maidenName;
    this.detailsObj.dateOfBirth=result.dateOfBirth;
    this.detailsObj.gender=result.gender;
    this.detailsObj.placeOfBirth=result.placeOfBirth;
    this.detailsObj.countryOfBirth=result.countryOfBirth;
    this.detailsObj.maritalStatus=result.maritalStatus;
    this.detailsObj.aadharNum=result.aadharNum;
    this.detailsObj.mobile=result.mobile;
    this.detailsObj.emailId=result.emailId;
    this.detailsObj.fatherName=result.fatherName;
    this.detailsObj.motherName=result.motherName;
    this.detailsObj.spouseName=result.spouseName;
    this.detailsObj.idType=result.idType;
    this.detailsObj.idNumber=result.idNumber;
    this.detailsObj.issuedOn=result.issuedOn;
    this.detailsObj.panCard=result.panCard;
    this.detailsObj.nameOnPAN=result.nameOnPAN;
    this.detailsObj.addressLine1=result.addressLine1;
    this.detailsObj.addressLine2=result.addressLine2;
    this.detailsObj.city=result.city;
    this.detailsObj.state=result.state;
    this.detailsObj.pincode=result.pincode;
    this.detailsObj.country=result.country;
    this.detailsObj.educationalQualification=result.educationalQualification;
    this.detailsObj.occupation=result.occupation;
    this.detailsObj.annualIncome=result.annualIncome;
    this.detailsObj.religion=result.religion;
    this.detailsObj.inbRights=result.inbRights;
    this.detailsObj.smsAlerts=result.smsAlerts;
    this.detailsObj.chequeBook=result.chequeBook;
    this.detailsObj.debitCard =result.debitCard;
    this.detailsObj.nameOnCard=result.nameOnCard;
    this.detailsObj.nomineeReq=result.nomineeReq;
    this.detailsObj.nomineeName=result.nomineeName;
    this.detailsObj.nomineeRel=result.nomineeRel;
    this.detailsObj.nomineeDOB=result.nomineeDOB;
    this.detailsObj.nomineeAddressLine1=result.nomineeAddressLine1;
      

   }
   
  ngOnInit(): void {
    this.myForm=new FormGroup({
      firstName: new FormControl('', [Validators.required, Validators.maxLength(20)]),
      middleName: new FormControl('', [Validators.required, Validators.maxLength(20)]),
      lastName: new FormControl('', [Validators.required, Validators.maxLength(20)]),
      maidenName:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      dateOfBirth:new FormControl('',[Validators.required]),
      gender:new FormControl('', [Validators.required]),
      mobile: new FormControl('',[Validators.required, Validators.pattern("^[0-9]*$"),
      Validators.minLength(10), Validators.maxLength(10)]),
      emailId : new FormControl('', [Validators.required,Validators.email]),
      dateofBirth:new FormControl('',[Validators.required]),
      placeOfBirth:new FormControl('', [Validators.required,Validators.maxLength(20)]),
      countryOfBirth:new FormControl('', [Validators.required,Validators.maxLength(20)]),
      maritalStatus:new FormControl('', [Validators.required]),
      aadharNum:new FormControl('',[Validators.required]),
      fatherName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      motherName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      spouseName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      idType:new FormControl('', [Validators.required]),
      idNumber:new FormControl('', [Validators.required]),
      issuedOn:new FormControl('',[Validators.required]),
      panCard:new FormControl('',[Validators.required]),
      nameOnPAN:new FormControl('', [Validators.required]),
      addressLine1:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      addressLine2:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      city:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      state:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      pincode:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      country:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      educationalQualification:new FormControl('', [Validators.required, Validators.maxLength(20)]),
      occupation:new FormControl('', [Validators.required]),
      annualIncome:new FormControl('', [Validators.required]),
      religion:new FormControl('', [Validators.required]),
      inbRights:new FormControl('', [Validators.required]),
      smsAlerts:new FormControl('', [Validators.required]),
      chequeBook:new FormControl('', [Validators.required]),
      debitCard:new FormControl('', [Validators.required]),
      nameOnCard:new FormControl('', [Validators.required]),
      nomineeReq:new FormControl('', [Validators.required]),
      nomineeDOB:new FormControl('',[Validators.required]),
      nomineeRel:new FormControl('', [Validators.required, Validators.maxLength(10)]),
      nomineeName:new FormControl('', [Validators.required]),
      nomineeAddressLine1:new FormControl('', [Validators.required]),
});
  }
  

  public myError = (controlName: string, errorName: string) =>{
    return this.myForm.controls[controlName].hasError(errorName);
    }
    moveToSelectedTab(tabName: string) {
      for (let i =0; i< document.querySelectorAll('.mat-tab-label-content').length; i++) {
      if ((<HTMLElement>document.querySelectorAll('.mat-tab-label-content')[i]).innerText == tabName) 
         {
            (<HTMLElement>document.querySelectorAll('.mat-tab-label')[i]).click();
         }
        }
       
      }
      addApplicant(){
      this.applicantService.addSingleApplicantService(this.detailsObj).subscribe({
        next:(data:MyStatus) => {
          this.appDetails.push(this.detailsObj);
          this.message=data.message;
          console.log('~next : applicant is added');
          console.log('addAppl() is invoked..', this.message);
        },
        error:(err)=> {
          console.log('~~Error...');
  
          alert(err);
          this.message=err.error;
          console.log(err);
        },
        complete:()=> {
          console.log('~~~completed...');
        }
      });
    }
    homepage(){
      this.router.navigate(['/homepage']);
    }

    }
    
   



