import { Component, OnInit } from '@angular/core';
import { ProductService } from './product.service';
import { Product } from './product';
import { TargetMarket } from '../targetMarket/target-market';
import { Stack } from '../stack/stack';
import { StackService } from '../stack.service';
import { TargetMarketService } from '../target-market.service';



@Component({
  selector: 'product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  public products:Product[]
  public stacks:Stack[]
  public markets:TargetMarket[]
  public filteredStacks: Stack[];
  public filteredMarkets: TargetMarket[];

  constructor(private productService:ProductService, private stackService:StackService,private marketService:TargetMarketService) {}

  ngOnInit() {
    this.productService.getAllProducts().subscribe(
      response => {
        this.products = response
      })
  }

  filterMarketMultiple(event) {
    let query = event.query;
    this.marketService.searchTargetMarkets(query).subscribe(
      response => {
        this.filteredMarkets = response
      })
  }

  filterStackMultiple(event) {
    let query = event.query;
    this.stackService.searchStacks(query).subscribe(
      response => {
        this.filteredStacks = response
      })
  }

  selectStack(){
    this.productService.getProducts(this.markets,this.stacks).subscribe(
      response => {
        this.products = response
      })
  }

  selectMarket(){
    this.productService.getProducts(this.markets,this.stacks).subscribe(
      response => {
        this.products = response
      })
  }





}
