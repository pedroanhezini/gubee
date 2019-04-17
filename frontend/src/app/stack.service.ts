import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Stack } from './stack/stack';



@Injectable({
  providedIn: 'root'
})
export class StackService {

  url = "http://localhost:8080/tecnologias"
  constructor(private http: HttpClient) { 
  }

  searchStacks(term: string): Observable<Stack[]> {
    if (term.trim()) {
      return this.http.get<Stack[]>(`${this.url}/?nome=${term}`)
    }

  }



}