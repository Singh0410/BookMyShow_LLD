package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Theatre  extends BaseModel
{
 private String name;

 /*
 Theatre     Screen
  1           m
  1            1
  */

 @OneToMany
 private List<Screen> screens;
}
