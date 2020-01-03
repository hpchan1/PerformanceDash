import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TeamTargetsPerformanceComponent } from './team-targets-performance.component';

describe('TeamTargetsPerformanceComponent', () => {
  let component: TeamTargetsPerformanceComponent;
  let fixture: ComponentFixture<TeamTargetsPerformanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TeamTargetsPerformanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TeamTargetsPerformanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
