import { Component, OnInit } from '@angular/core';
import { StudentService } from '../services/student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor(private service: StudentService) { }
  results: any = [];
  ngOnInit(): void {
  }

  public getStudents() {
    this.service.getStudents().subscribe(
      res => {
        this.results = res.results;
        console.log('response', res);
      }, error => {
        console.log('Error Occured');
      }
    );

  }


  public addStudent() {
    this.service.addStudent().subscribe(
      res => {
        this.results = res.results;
        console.log('response', res);
      }, error => {

        console.log('Error Occured');

      });
  }

}
