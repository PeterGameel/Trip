import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { AllScheduleComponent } from './all-schedule/all-schedule.component';
import { DeleteTripComponent } from './delete-trip/delete-trip.component';
import { UpdateTripComponent } from './update-trip/update-trip.component';
import { AddStationComponent } from './add-station/add-station.component';
import { CreateTripComponent } from './create-trip/create-trip.component';
import { DeleteStationComponent } from './delete-station/delete-station.component';
import {HttpClientModule} from '@angular/common/http';
import {Observable} from 'rxjs';
import { FormsModule } from '@angular/forms';
import { MainComponent } from './main/main.component';

@NgModule({

  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    AllScheduleComponent,
    DeleteTripComponent,
    UpdateTripComponent,
    AddStationComponent,
    CreateTripComponent,
    DeleteStationComponent,
    MainComponent,
    ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],

  providers: [],
  bootstrap: [AppComponent]

})
export class AppModule { }
