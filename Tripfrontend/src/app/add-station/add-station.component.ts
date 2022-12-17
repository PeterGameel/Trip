import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { StationService } from '../station.service';

@Component({
  selector: 'app-add-station',
  templateUrl: './add-station.component.html',
  styleUrls: ['./add-station.component.css']
})

export class AddStationComponent implements OnInit {

  constructor(private stationservice: StationService) { }

  ngOnInit(): void {
  }

  public onaddstation(addform: NgForm): void {
    this.stationservice.addStation(addform.value).subscribe(
      (response: any) => {

      }
    )
  }

}
