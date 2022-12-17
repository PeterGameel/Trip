import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AddStationComponent } from './add-station/add-station.component';
import { AllScheduleComponent } from './all-schedule/all-schedule.component';
import { DeleteTripComponent } from './delete-trip/delete-trip.component';
import { UpdateTripComponent } from './update-trip/update-trip.component';
import { CreateTripComponent } from './create-trip/create-trip.component';
import { DeleteStationComponent } from './delete-station/delete-station.component';
import { MainComponent } from './main/main.component';

const routes: Routes = [
    
  {path: 'addstaion', component: AddStationComponent},
  {path: 'createtrip', component:CreateTripComponent},
  {path: 'updatetrip', component: UpdateTripComponent},
  {path: 'deletetrip', component: DeleteTripComponent},
  {path: 'allschedule', component: AllScheduleComponent},
  {path: 'signup', component: SignupComponent},
  {path: 'login', component:LoginComponent},
  {path: 'deletestation' , component:DeleteStationComponent},
  {path: 'main' , component:MainComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    RouterModule.forRoot([
      {path: 'addstaion', component: AddStationComponent},
      {path: 'createtrip', component:CreateTripComponent},
      {path: 'updatetrip', component: UpdateTripComponent},
      {path: 'deletetrip', component: DeleteTripComponent},
      {path: 'allschedule', component: AllScheduleComponent},
      {path: 'signup', component: SignupComponent},
      {path: 'login', component:LoginComponent},
      {path: 'deletestation' , component:DeleteStationComponent},
      {path: 'main' , component:MainComponent}
      
    ])
  ],
  
  exports: [RouterModule]

})

export class AppRoutingModule { }
