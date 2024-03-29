package com.BookMyShow.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Entity(name = "Shows")
public class Show extends  BaseModel
{

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Screen screen;

}
