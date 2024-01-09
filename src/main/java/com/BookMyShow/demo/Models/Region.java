package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Region extends BaseModel{

    private String name;

    /*
    Region   Theatre
    1         m
     1         1
     */
    @OneToMany
    private List<Theatre> theatres;

}
