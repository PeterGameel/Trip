import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { TripService } from '../trip.service';

@Component({
  selector: 'app-create-trip',
  templateUrl: './create-trip.component.html',
  styleUrls: ['./create-trip.component.css']
})

export class CreateTripComponent implements OnInit {

  constructor(private tripService: TripService) { }

  ngOnInit(): void {
  }

  public onaddtrip(addform: NgForm):void {
    this.tripService.addTrip(addform.value).subscribe(
      (response: any) => {
        
      }
    )
  }

}
