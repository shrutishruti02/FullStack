import { Injectable } from '@angular/core';
import { Details } from './details/details';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { MyStatus } from './MyStatus';
@Injectable({
  providedIn: 'root'
})
export class ApplicantService {

 applicant:Details=new Details(); 

  constructor(private myHttp: HttpClient) { }

  // loadAllApplicantService() : Observable<Details[]>{
  //   console.log('loadAllApplicantService() invoked....')
  //   return this.myHttp.get<Details[]>("http://localhost:8080/appDetails/")
  // }

  addSingleApplicantService(applicant: Details):Observable<MyStatus>{
    console.log('addSingleApplicantService() is invoked....');
    return this.myHttp.post<MyStatus>("http://localhost:8080/appl/addappl/", applicant);
  }

  

}

