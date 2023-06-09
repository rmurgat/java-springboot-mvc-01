package com.rmurga.mymovies.controller;

import com.rmurga.mymovies.entity.Movie;
import com.rmurga.mymovies.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListController {

    private final MovieService movieService;

    public ListController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/")
    public String listMovies(Model model) {
        List<Movie> themovies = movieService.getMovies();
        model.addAttribute("movies", themovies);
        return "list";
    }

    @RequestMapping("/moviesbystocklist")
    public String listMoviesByStocklist(int stocklistid, Model model) {
        List<Movie> movies = movieService.getByStocklist(stocklistid);
        model.addAttribute("movies", movies);
        return "list";
    }

    @RequestMapping("/find")
    public String listMoviesByStocklist(@RequestParam("query") String s, Model model) {
        List<Movie> movies = movieService.findByNameContaining(s);
        model.addAttribute("movies", movies);
        return "list";
    }
}
