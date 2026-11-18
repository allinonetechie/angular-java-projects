import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-health',
  templateUrl: './health.component.html',
  styleUrls: ['./health.component.scss']
})
export class HealthComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results:any = [];
  ngOnInit(): void {
    this.dataService.getHealthNews().subscribe((response)=> {
      this.results = response.results;
      console.log(response);
    });
  }

}
