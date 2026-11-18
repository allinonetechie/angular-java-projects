import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const httpOptions = {
  heaer: new HttpHeaders({'Content-Type': 'application/json',
                          'Access-Control-Allow-Origin': '*',
                          'Access-Control-Allow-Methods': 'GET,POST,OPTIONS,DELETE,PUT'})
};

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }

//used proxy to resolve CORS
getStudents(): Observable<any>{
  return this.http.get('/api/all');
}

addStudent(): Observable<any>{
  return this.http.post('/api/add', httpOptions);
}

}
