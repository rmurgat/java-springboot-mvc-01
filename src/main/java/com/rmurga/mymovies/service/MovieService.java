package com.rmurga.mymovies.service;

import com.rmurga.mymovies.entity.Movie;
import com.rmurga.mymovies.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies() {
        return movieRepository.getallAndOrdered();
    }

    public List<Movie> getByStocklist(int stocklistid) {
        return movieRepository.getbyStocklist(stocklistid);
    }

    public List<Movie> findByNameContaining(String name) {
        return movieRepository.findByNameContaining(name);
    }

}
