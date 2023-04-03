import { Component, OnInit } from '@angular/core';
import { User } from '../model/user.model';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  user:User=new User();
message:any;
  constructor(private service:UserService,public router:Router) { }
  
    ngOnInit(): void {
   
    }
    
    addUser() {
      let response=this.service.addUser(this.user)
      response.subscribe((data:any)=>this.user=data);
      

      if(this.user.name!=null){
        this.message="Registered Successfully!!";
      }
    }
  
  }