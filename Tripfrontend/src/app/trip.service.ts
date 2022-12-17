import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Trip} from './trip';
import {Observable} from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class TripService {

  private apiServerUrl = environment.apiUrl ;

  constructor(private http: HttpClient) { }


  addTrip(trip: Trip): Observable<any> 
  {
    return this.http.post<any>(`${this.apiServerUrl}/start/addTrip`, trip );
  }

  updateTrip(trip: Trip): Observable<any> 
  {
    return this.http.put<any>(`${this.apiServerUrl}/start/updateTrip/${trip}`, trip );
  }

  deleteTrip(trip: number): Observable<any> {
    return this.http.delete<any>(`${this.apiServerUrl}/start/removeTrip/${trip}`);
  }
  
}
