import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Admin } from './admin';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class AdminService {

  private apiUrl = environment.apiUrl;

  constructor(private _http:HttpClient) { }

  signup(admin:Admin):Observable<any>
  {
      return this._http.post<any>(`${this.apiUrl}/start/register`, admin) ;  
  }

  login(admin:Admin)
  {
      return ;  
  }

}
