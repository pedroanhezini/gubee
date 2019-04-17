import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpParams } from '@angular/common/http';
import { TargetMarket } from './targetMarket/target-market';




@Injectable({
  providedIn: 'root'
})
export class TargetMarketService {

  url = "http://localhost:8080/mercados"
  constructor(private http: HttpClient) { 

  }
  searchTargetMarkets(term: string): Observable<TargetMarket[]> {
    if (term.trim()) {
      return this.http.get<TargetMarket[]>(`${this.url}/?nome=${term}`)
    }

  }



}