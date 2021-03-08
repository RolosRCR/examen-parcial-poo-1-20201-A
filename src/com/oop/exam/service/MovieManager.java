package com.oop.exam.service;

import com.oop.exam.model.Movie;

import java.util.LinkedList;

public class MovieManager {
    private LinkedList<Movie> movies;
private String name;
    public MovieManager() {
        this.movies = new LinkedList<>();
    }

    public LinkedList<Movie> getMovies() {
        return movies;
    }
    public Movie findMovie (String title){for (Movie movie : movies) {if(movie.getTitle()==title)return movie;}

    public void addMovie(Movie Movie movie;
        movie) {
        movies.add(movie);
    }
}
