import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-sports',
  templateUrl: './sports.component.html',
  styleUrls: ['./sports.component.scss']
})
export class SportsComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results:any = [];
  ngOnInit(): void {
    this.dataService.getSportsNews().subscribe((response)=> {
      this.results = response.results;
    });
  }

}
