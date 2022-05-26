import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BankRegistrationComponent } from './bank-registration/bank-registration.component';
import { SimpleInterestCalculatorComponent } from './simple-interest-calculator/simple-interest-calculator.component';
import { FormsModule } from '@angular/forms';
import { BankApplicantComponentComponent } from './bank-applicant-component/bank-applicant-component.component';
import { SquarePipe } from './square.pipe';
import { PnrPipe } from './pnr.pipe';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule,} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import { CurrencyConverterComponent } from './currency-converter/currency-converter.component';
import { RegisterComponent } from './register/register.component';
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatIconModule} from '@angular/material/icon';
import {MatListModule} from '@angular/material/list';
import { FlowersModule } from './flowers/flowers.module';
import { BirdsModule } from './birds/birds.module';
import { AnimalsModule } from './animals/animals.module';
import { HttpClientModule } from '@angular/common/http';
import { SingleUserDetailsComponent } from './single-user-details/single-user-details.component';
import { UserDetailsComponent } from './userdetails/userdetails/userdetails.component';
import { AddUserDetailsComponent } from './add-user-details/add-user-details.component';
import { UpdateUserDetailsComponent } from './update-user-details/update-user-details.component';
import { DeleteUserDetailsComponent } from './delete-user-details/delete-user-details.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatTabsModule} from '@angular/material/tabs';
import {MatInputModule} from '@angular/material/input';
import {MatCardModule} from '@angular/material/card'
import { HomepageComponent } from './homepage/homepage.component';
import { DetailsComponent } from './details/details.component';
import {MatSelectModule} from '@angular/material/select';
import { MatNativeDateModule } from '@angular/material/core';
import { MatDatepickerModule} from '@angular/material/datepicker';

import {MatCheckboxModule} from '@angular/material/checkbox';
import {MatRadioModule} from '@angular/material/radio';
import { AboutComponentComponent } from './about-component/about-component.component';


import { Register1Component } from './register1/register1.component';

import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

import { LogoutComponent } from './logout/logout.component';
import { ReactiveFormsModule } from '@angular/forms';
import { LoginUserComponent } from './login-user/login-user.component';






@NgModule({
  declarations: [
    AppComponent,
    BankRegistrationComponent,
    SimpleInterestCalculatorComponent,
    BankApplicantComponentComponent,
    SquarePipe,
    PnrPipe,
    CurrencyConverterComponent,
    RegisterComponent,
    SingleUserDetailsComponent,
    UserDetailsComponent,
    AddUserDetailsComponent,
    UpdateUserDetailsComponent,
    DeleteUserDetailsComponent,
    HomepageComponent,
    DetailsComponent,
    
    AboutComponentComponent,
  
    
    Register1Component,
    
    PageNotFoundComponent,
    
    LogoutComponent,
         LoginUserComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    FlowersModule,
    BirdsModule,
    AnimalsModule,
    HttpClientModule,
    MatFormFieldModule,
    MatInputModule,
    MatCardModule,
    MatToolbarModule,
    MatIconModule,
    FormsModule,
    MatSidenavModule,
    MatTabsModule,
    MatSelectModule,
    MatNativeDateModule,
    MatDatepickerModule,
    MatDatepickerModule,
    MatCheckboxModule,
    MatRadioModule,
    ReactiveFormsModule,
    MatIconModule,
    MatToolbarModule

  
  
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }