import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss']
})
export class BooksComponent implements OnInit {

  constructor(private dataService: DataService) { }
  results: any = [];
  ngOnInit(): void {
    this.dataService.getBooksNews().subscribe((response)=> {
      console.log(response);
      this.results = response.results;
    });
  }

}
