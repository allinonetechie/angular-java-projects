import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.scss']
})
export class TechnologyComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results:any = [];
  ngOnInit(): void {
    this.dataService.getTechnologyNews().subscribe((response)=> {
      this.results = response.results;
    });
  }

}
