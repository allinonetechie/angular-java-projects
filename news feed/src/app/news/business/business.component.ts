import { Component, OnInit } from '@angular/core';
import { DataService } from '../../service/data.service';



@Component({
  selector: 'app-business',
  templateUrl: './business.component.html',
  styleUrls: ['./business.component.scss']
})
export class BusinessComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results : any = [];
  category: boolean;
  ngOnInit(): void {
    this.dataService.getBusinessNews().subscribe((response)=> {
      console.log(response);
      this.results = response.results;
    });
  }

}
