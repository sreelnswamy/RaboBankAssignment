import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FileserviceService } from './fileservice.service';
import { Users } from './users';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  inputs:['activeColor','baseColor','overlayColor']
})
export class AppComponent {
  loaded: boolean = false;
  imageSrc: string = '';
  public api='';
  user:Users = new Users()
  constructor(private http: HttpClient,public service:FileserviceService) {}
 

  handleInputChange(e) {
      console.log("input change")
      var file = e.dataTransfer ? e.dataTransfer.files[0] : e.target.files[0];

      var pattern = /image-*/;
      var reader = new FileReader();

      // if (!file.type.match(pattern)) {
      //     alert('invalid format');
      //     return;
      // }

      this.loaded = false;

      reader.onload = this._handleReaderLoaded.bind(this);
      reader.readAsDataURL(file);
  }
  
  _handleReaderLoaded(e) {
       console.log("_handleReaderLoaded")
      var reader = e.target;
      this.imageSrc = reader.result;
      console.log('imageSrc',this.imageSrc);
      
      this.loaded = true;
  }
  
  
  
  cancel(){
         this.imageSrc="null"
  }
  public users:any=[];
  submit(){
    let json={
      filedat:this.imageSrc
    }
    
    this.http.post(this.api,json)
    .subscribe(data => {
      this.users = data;
    });
  }
}
