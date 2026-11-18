import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.scss']
})
export class EntertainmentComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any = [];
  magazines: any = [];
  ngOnInit(): void {
    this.dataService.getEntertainmentNews().subscribe((response)=> {
      console.log(response);
      this.results = response.results;
    });

    this.dataService.getMagazineNews().subscribe((response)=> {
      
      this.magazines = response.results;
    });
  }

}
