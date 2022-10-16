import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { person } from '../model/person.model';

@Injectable({
  providedIn: 'root'
})
export class PersonService {
  URL = 'http//localhost:8080/persons/';
  constructor(private http: HttpClient) { }
  public getPerson(): Observable<person>{
    return this.http.get<person>(this.URL + 'traer/perfil');
  }
}
