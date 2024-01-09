package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User extends BaseModel{
    private  String name;
    private int phoneNumber;
    private String email;
    /*
    User Booking
    1     M
     1     1
     */
    @OneToMany
    private List<Booking> bookings;
}
