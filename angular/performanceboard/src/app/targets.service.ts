import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TargetsService {
  product = new BehaviorSubject([
    {
      id: 1,
      title: "Clearing up the hot issue",
      description: "Will focusing on clearing the repeated happened in this week.",
      solution: "Find out the reason causing the issue.",
      status: "Work In Progress",
      percent: 50,
      createdAt: "9 Dec 2019",
      updatedAt: "13 Dec 2019"
    }
  ])

  constructor(private targetsService: TargetsService) { }
}
