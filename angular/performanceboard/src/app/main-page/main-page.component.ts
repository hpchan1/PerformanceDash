import { Component, OnInit } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { TargetsService } from '../targets.service'

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  targets = []
   
  constructor(private targetsService: TargetsService) { }

  ngOnInit() {
    
  }

  onUpdate(){
    
  }

}
