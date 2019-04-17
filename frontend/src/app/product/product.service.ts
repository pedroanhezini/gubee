import { Injectable } from '@angular/core';
import { TargetMarket } from '../targetMarket/target-market';
import { Observable } from 'rxjs';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Stack } from '../stack/stack';
import { elementStyleProp } from '@angular/core/src/render3';
import { Product } from './product';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public markets:TargetMarket[]
  public stacks:Stack[]
  url = "http://localhost:8080/produtos"
  constructor(private http: HttpClient) { 
  }

  getProducts(markets:TargetMarket[],stacks:Stack[]):Observable<Product[]>{
    let params
    if(markets&&stacks){
      params = new HttpParams().set("mercados",JSON.stringify(markets)).set("tecnologias", JSON.stringify(stacks))
    }else if(markets){
      params = new HttpParams().set("mercados",JSON.stringify(markets))
    }else if(stacks){
      params = new HttpParams().set("tecnologias", JSON.stringify(stacks))
    }
    return this.http.get<Product[]>(this.url,{params:params})
  }

  getAllProducts():Observable<Product[]>{
    return this.http.get<Product[]>(this.url);
  }



}
