import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdmindashboardComponent } from './admindashboard/admindashboard.component';
import { CustomerdashboardComponent } from './customerdashboard/customerdashboard.component';
import { CustomerproductviewComponent } from './customerproductview/customerproductview.component';
import { LoginComponent } from './login/login.component';
import { OrderinfoComponent } from './orderinfo/orderinfo.component';
import { ProductviewComponent } from './productview/productview.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    AdmindashboardComponent,
    CustomerdashboardComponent,
    CustomerproductviewComponent,
    LoginComponent,
    OrderinfoComponent,
    ProductviewComponent,
    SignupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
