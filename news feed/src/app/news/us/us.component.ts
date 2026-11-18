import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-us',
  templateUrl: './us.component.html',
  styleUrls: ['./us.component.scss']
})
export class UsComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any =[];
  ngOnInit(): void {
    this.dataService.getUsNews().subscribe((response)=> {
      this.results = response.results;
    });  
  }

}
