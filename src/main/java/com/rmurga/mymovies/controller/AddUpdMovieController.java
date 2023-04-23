package com.rmurga.mymovies.controller;

import com.rmurga.mymovies.service.MovieService;
import com.rmurga.mymovies.service.StocklistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.rmurga.mymovies.entity.Movie;

@Controller
public class AddUpdMovieController {

    private final StocklistService stocklistService;
    private final MovieService movieService;

    public AddUpdMovieController(StocklistService stocklistService, MovieService movieService) {
        this.stocklistService = stocklistService;
        this.movieService = movieService;
    }

    @RequestMapping("/movies/add")
    public String showFormAdd(Model model)  {
        model.addAttribute("stocklists", stocklistService.getAllStocklist());
        model.addAttribute("movie", new Movie());
        return "movieForm.html";
    }
    @PostMapping("/movies/save")
    public String addNewMovie(Movie movie2add) {
        movieService.save((movie2add));
        return "redirect:/";
    }
}
