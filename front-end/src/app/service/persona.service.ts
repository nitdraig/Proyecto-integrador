import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

import { persona } from '../models/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {
// URL = 'https://backenddraig.herokuapp.com/personas/';
//URL = 'https://2-production-2480.up.railway.app/personas/';
URL: 'https://proyect-ap-nitdraig.koyeb.app/personas/';


;

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<persona[]>{
    return this.httpClient.get<persona[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<persona>{
    return this.httpClient.get<persona>(this.URL + `detail/${id}`);
  }

  public update(id: number, Persona: persona): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, Persona);
  }

}
