import { Component, OnInit } from '@angular/core';
import { DetailsComponent } from '../details/details.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {

  }
  register()
  {
    this.router.navigate(['/details']);
  }

}
