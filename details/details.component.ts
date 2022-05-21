import { Component, OnInit } from '@angular/core';
import {ThemePalette} from '@angular/material/core';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  links = ['Personal Details', 'KYC Details', 'Address Details','Additional Details','Nomination Details','Services Required','Submit'];
  activeLink = this.links[0];
  background: ThemePalette =  'primary';
 
  toggleBackground() {
    this.background = this.background ? undefined : 'primary';
  }
  constructor() { }

  ngOnInit(): void {
  }

}
