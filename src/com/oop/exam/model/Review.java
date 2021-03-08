package com.oop.exam.model;

import com.oop.exam.model.MovieScore;

import javax.sql.RowSet;

public class Review {
    private User name;
    private MovieScore movieScore;
    private String title;
public Review(User name,MovieScore movieScore,String title)  {
    this.name=name;
this.movieScore=movieScore;
this.title=title}

    public User getUser() {
    return name;
    }
}
