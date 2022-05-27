import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginUserComponent } from './login-user/login-user.component';
import { DetailsComponent } from './details/details.component';
import { HomepageComponent } from './homepage/homepage.component';
import { SuccessPageComponent } from './success-page/success-page.component';

const routes: Routes = [
// {path:'about',
//   children:[
//     {path:'',component:AboutComponentComponent},
//     {path:'our-comp',component:OurCompanyComponent},
//     {path:'our-emps',component:OurEmployeesComponent},
//   ]
// },

// {path:'our-comp',component:OurCompanyComponent},
// {path:'login',component:LoginComponent},
// {path:'register',component:Register1Component},
// {path:'dashboard',component:DashboardComponent},
// {path:'admin-dashboard',component:AdminDashboardComponent},
// {path:'**',component:PageNotFoundComponent},
{path:'',component:HomepageComponent},
{path:'details',component:DetailsComponent},
{path:'homepage',component:HomepageComponent},
{path:'loginuser',component:LoginUserComponent},
{path:'success',component:SuccessPageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
