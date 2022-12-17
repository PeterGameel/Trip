import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Station } from './station';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class StationService {

  private apiUrl = environment.apiUrl ;

  constructor(private http: HttpClient) { }

  
  addStation(station:Station): Observable<any>
  {
    return this.http.post<any>(`${this.apiUrl}/start/addStation`, station) ;
  }

  deletestation(ID: number): Observable<any>
  {
    return this.http.delete<any>(`${this.apiUrl}/start/removeStation/${ID}`)
  }

  getallstation():Observable<any>
  {
    return this.http.get<any>(`${this.apiUrl}/start/showStations`) ;
  }

}
