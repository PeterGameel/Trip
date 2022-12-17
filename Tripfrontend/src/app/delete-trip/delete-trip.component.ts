import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Trip } from '../trip';
import { TripService } from '../trip.service';

@Component({
  selector: 'app-delete-trip',
  templateUrl: './delete-trip.component.html',
  styleUrls: ['./delete-trip.component.css']
})
export class DeleteTripComponent implements OnInit {

  trip: Trip = {
    TripID: 0 ,
    starDate: "" ,
    EndTime: "" ,
    FromStation: "" ,
    ToStation: "" 
  }

  constructor(private tripdeleteservice: TripService) { }

  ngOnInit(): void {
  }

  public ondeletetrip(ID: number):void {
    this.tripdeleteservice.deleteTrip(ID).subscribe(
      data => 
      { 
        console.log(data) ; 
      }
    ) ;
  }
}
