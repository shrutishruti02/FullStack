import { Component, OnInit } from '@angular/core';

import { FormControl, FormGroup, FormGroupDirective, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import {ThemePalette } from '@angular/material/core';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
// export class MyErrorStateMatcher implements ErrorStateMatcher {
//   isErrorState(control: FormControl | null, form: FormGroupDirective | NgForm | null): boolean {
//     const isSubmitted = form && form.submitted;
//     return !!(control && control.invalid && (control.dirty || control.touched || isSubmitted));
//   }
// }
export class DetailsComponent implements OnInit {
  

  links = ['Personal Details', 'KYC Details', 'Address Details','Additional Details','Nomination Details','Services Required','Submit'];
  activeLink = this.links[0];
  active=0;
 

  selected = new FormControl(0);
  background: ThemePalette =  'primary';
 
  toggleBackground() {
    this.background = this.background ? undefined : 'primary';
  }
  constructor(private router:Router) { }
   myForm:any;
   //panCardPattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
   
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
      placeOfBirth:new FormControl('', [Validators.required,Validators.maxLength(20)]),
      countryOfBirth:new FormControl('', [Validators.required,Validators.maxLength(20)]),
      maritalStatus:new FormControl('', [Validators.required]),
      fatherName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      motherName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      spouseName:new FormControl('', [Validators.required, Validators.maxLength(30)]),
      idType:new FormControl('', [Validators.required]),
      // idNumber:new FormControl('', [Validators.required]),
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
    onTabChange(e: any) {
      console.log(e);
    }
    homepage(){
      this.router.navigate(['/homepage']);
    }
}
