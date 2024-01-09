package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends  BaseModel{

   /*
   showSeatType   show
      1            M
      m            1

      showSeatType
      1| Gold| 150
      2| Diamond| 250
      1 | Platinum| 350
    */
   @ManyToOne
   private Show show;
   private  String seatType;
   private int price;
}
