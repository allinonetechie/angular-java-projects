import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-science',
  templateUrl: './science.component.html',
  styleUrls: ['./science.component.scss']
})
export class ScienceComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results:any = []
  ngOnInit(): void {
    this.dataService.getScienceNews().subscribe((response)=> {
      this.results = response.results;
    });
  }

}
