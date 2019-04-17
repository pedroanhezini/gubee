import { NgModule } from '@angular/core';
import {Routes, RouterModule} from '@angular/router'

const routes: Routes = [
  { 
    path: 'product', 
    loadChildren: './product/product.module#ProductModule'
  },
  {
    path:'',
    pathMatch:'full',
    redirectTo:'/product'
  }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes,{useHash:true})
  ],
  exports:[RouterModule]
})

export class AppRoutingModule { }
