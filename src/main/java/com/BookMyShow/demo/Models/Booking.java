package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

     @Enumerated(EnumType.ORDINAL)
     private BookingStatus Status;

     @OneToMany
     private List<ShowSeat> showSeatList;

     private int amount;
     @OneToMany
     private List<Payment> payments;
}
