import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-world',
  templateUrl: './world.component.html',
  styleUrls: ['./world.component.scss']
})
export class WorldComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any = [];
  ngOnInit(): void {
    this.dataService.getWorldNews().subscribe((response)=> {
      this.results = response.results;
    });  
  }

}
