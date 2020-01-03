import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainPageComponent } from './main-page/main-page.component';
import { TeamTargetsPerformanceComponent } from './team-targets-performance/team-targets-performance.component';


@NgModule({
  declarations: [
    AppComponent,
    MainPageComponent,
    TeamTargetsPerformanceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
