import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  // template:`<h1> THIS IS FROM INLINE TEMPLATE FROM HOME`,
  styleUrls: ['./home.component.scss']
  /*
  // inline  styles
  styles[ `
    p { font-weight: bold; }
    div { color: gray; }
    `]
    */
})
export class HomeComponent implements OnInit {

  itemCount: number = 4;
  btnText: string = ' Add an Item ';
  goalText: string = 'my First Life Goal';

  constructor() { }

  ngOnInit() {
  }

}
