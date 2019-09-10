import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class FileserviceService {
public api=''
  constructor(private http: HttpClient)  { }

  upload(jsonval){
    let json;
    this.http.post(`https://my-json-server.typicode.com/techsithgit/json-faker-directory/profiles/`,{name:'mark',age:'32'}).subscribe(
      (data: any[]) => {
          console.log(data);
      }
    )
  }
}
