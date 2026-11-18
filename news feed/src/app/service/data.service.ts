import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { analyzeAndValidateNgModules } from '@angular/compiler';
import { Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  // business API URL
  businessApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/business.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    
  getBusinessNews(): Observable<any>{
  return this.http.get(this.businessApiUrl);
  }

// EntertainmentAPI URL
entertainmentApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/movies.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=450";
    

  getEntertainmentNews(): Observable<any>{
    return this.http.get(this.entertainmentApiUrl);
    }



    // Health API URL
healthApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/health.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=450";
    

getHealthNews(): Observable<any>{
  return this.http.get(this.healthApiUrl);
  }

   // Political API URL
   politicalApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/u.s.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

   getPoliticalNews(): Observable<any>{
     return this.http.get(this.politicalApiUrl);
     }


     // ScienceAPI URL
   scienceApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/science.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

   getScienceNews(): Observable<any>{
     return this.http.get(this.scienceApiUrl);
     }


      // Sports API URL
   sportsApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/sports.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

   getSportsNews(): Observable<any>{
     return this.http.get(this.sportsApiUrl);
     }



// Technology API URL
technologyApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/technology.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getTechnologyNews(): Observable<any>{
  return this.http.get(this.technologyApiUrl);
  }


  // Arts API URL
artsApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/arts.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getArtsNews(): Observable<any>{
  return this.http.get(this.artsApiUrl);
  }


   // Home/Default API URL
//homeApiUrl : any = "https://api.nytimes.com/svc/topstories/v2/home.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah";
homeApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/all.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getHomeNews(): Observable<any>{
  return this.http.get(this.homeApiUrl);
  }

   // US API URL
   usApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/u.s.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

   getUsNews(): Observable<any>{
     return this.http.get(this.usApiUrl);
     }

// world API URL
worldApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/world.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getWorldNews(): Observable<any>{
  return this.http.get(this.worldApiUrl);
  }


  // magazine API URL
magazineApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/magazine.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getMagazineNews(): Observable<any>{
  return this.http.get(this.magazineApiUrl);
  }




    // Food API URL
foodApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/food.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

getFoodNews(): Observable<any>{
  return this.http.get(this.foodApiUrl);
  }


 // Book API URL
 booksApiUrl : any = "https://api.nytimes.com/svc/news/v3/content/all/books.json?api-key=ieM1hDCrPh11tIOpLmDULeeTA7tIW5Ah&limit=500";
    

 getBooksNews(): Observable<any>{
   return this.http.get(this.booksApiUrl);
   }


}
