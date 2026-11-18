import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-all',
  templateUrl: './all.component.html',
  styleUrls: ['./all.component.scss']
})
export class AllComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any = [];
  ngOnInit(): void {
    this.dataService.getHomeNews().subscribe((response)=> {
      console.log(response);
      this.results = response.results;
    });
  }

}
