package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie  extends  BaseModel{
     private String name;
     private String language;
}
