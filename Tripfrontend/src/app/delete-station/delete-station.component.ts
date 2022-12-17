import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Station } from '../station';
import { StationService } from '../station.service';

@Component({
  selector: 'app-delete-station',
  templateUrl: './delete-station.component.html',
  styleUrls: ['./delete-station.component.css']
})
export class DeleteStationComponent implements OnInit {

  station: Station ={
    StationID: 0,
    StationName: "string"
  }

  constructor(private stationservice: StationService) { }

  ngOnInit(): void {
  }

  public ondeletestation(ID: number): void{
    this.stationservice.deletestation(ID).subscribe(data => 
      { 
        console.log(data) ; 
      }
    );
  }

  // public getallstation():any{
  //   this.stationservice.getallstation().subscribe(
  //     (response:any) => {
  //       this.stations=response;
  //       this.stationservice.getallstation() ;
  //       return response ;
  //     }
  //   )
  // }

}
