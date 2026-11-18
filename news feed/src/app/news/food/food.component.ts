import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator, PageEvent } from '@angular/material/paginator';
import { DataService } from 'src/app/service/data.service';
import {MatPaginatorModule} from '@angular/material/paginator';

@Component({
  selector: 'app-food',
  templateUrl: './food.component.html',
  styleUrls: ['./food.component.scss']
})
export class FoodComponent implements OnInit {

  @ViewChild('paginator') paginator: MatPaginator;


  constructor(private dataService: DataService) { }
  results:any = [];
  currentPage = 1;
itemsPerPage = 50;
pageSize: number;
  ngOnInit(): void {
     this.dataService.getFoodNews().subscribe((response)=> {
      this.results = response.results;
    });
  }

  // onPageChange($event) {
  //   this.results =  this.results.slice($event.pageIndex*$event.pageSize,
  //   $event.pageIndex*$event.pageSize + $event.pageSize);
  // }

  public onPageChange(pageNum: number): void {
    this.pageSize = this.itemsPerPage*(pageNum - 1);
  }
  
  public changePagesize(num: number): void {
  this.itemsPerPage = this.pageSize + num;
}

}
