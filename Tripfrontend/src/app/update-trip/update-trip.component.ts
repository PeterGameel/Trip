import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { TripService } from '../trip.service';

@Component({
  selector: 'app-update-trip',
  templateUrl: './update-trip.component.html',
  styleUrls: ['./update-trip.component.css']
})

export class UpdateTripComponent implements OnInit {

  constructor(private tripservice: TripService) { }

  ngOnInit(): void {
  }

  public onupdatetrip(addform: NgForm): void {
    this.tripservice.updateTrip(addform.value).subscribe(
      (response: any) => {
        
      }
    )
  }

}
