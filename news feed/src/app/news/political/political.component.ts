import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-political',
  templateUrl: './political.component.html',
  styleUrls: ['./political.component.scss']
})
export class PoliticalComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any = [];
  ngOnInit(): void {

    this.dataService.getPoliticalNews().subscribe((response)=> {
      console.log(response);
      this.results = response.results;
    });
  
  }

}
