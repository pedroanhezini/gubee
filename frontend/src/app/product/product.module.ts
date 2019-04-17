import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductRoutingModule } from './product.routing.module';
import { ProductComponent } from './product.component';
import {AutoCompleteModule} from 'primeng/autocomplete';
import {FormsModule }   from '@angular/forms';
import {TableModule} from 'primeng/table';

@NgModule({
  declarations: [ProductComponent],
  imports: [
    CommonModule,
    ProductRoutingModule,
    TableModule,
    FormsModule,
    AutoCompleteModule

  ]
})
export class ProductModule { }
