package com.oop.exam.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private ArrayList<Review> reviews;
    private int year;
    private String director;
    private List<String> actors;
    private List<Platform> plataforms;
    private String synopsis;
    public Movie(String title)
    {
        this.title=title;
    }
    public Movie(String title,int year, String director)
    {
        this.title=title;
        int.year=year;
        this.director=director;
    }
    public void addReview(Review r){
        reviews.add(r);
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActors() {
        return actors;
    }

    public List<Platform> getPlataforms() {
        return plataforms;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReview(ArrayList<Review> review) {
        this.reviews = review;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public List<Platform> getPlatforms() {
        return plataforms;
    }

    public CharSequence getReviews() {
        return review;
    }

    public void setPlatforms(List<Platform> singletonList) {
        this.plataforms = singletonList;
    }
}
