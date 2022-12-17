import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { StationService } from '../station.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  
  constructor(private _stationService:StationService) { }

  ngOnInit(): void {
  }

  createTrip(formValue:NgForm)
  {
  
  }
}
