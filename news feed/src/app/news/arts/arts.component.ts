import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-arts',
  templateUrl: './arts.component.html',
  styleUrls: ['./arts.component.scss']
})
export class ArtsComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results:any = [];
  ngOnInit(): void {
    this.dataService.getArtsNews().subscribe((response)=> {
      this.results = response.results;
    });
  }

}
