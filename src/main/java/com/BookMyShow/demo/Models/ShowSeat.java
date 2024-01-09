package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel
{

    /*
    showSeat show
      1        1
import lombok.Getter;
      m         1

      showseat table
      1 |A1| Booked
      1 | A2|Booked
     */
    @ManyToOne
    private Show show;
    /*-
    showSeat seat
      1        1
      m         1

      showseat table
      1 |A1| Booked
      1 | A2|Booked
      2| A1| Booked
     */
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private SeatStatus status;

}
