package com.rmurga.mymovies.service;

import com.rmurga.mymovies.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        Movie movie = new Movie();
        movie.setName("The Rock");
        movie.setDescription("Two exquisite objection delighted deficient yet its contained. Cordial because are account evident its subject but eat.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/fea76b18f7f111ea98f310ddb1aba44f.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setName("Spider-Man");
        movie.setDescription("Over many our good lady feet ask that. Expenses own moderate day fat trifling stronger sir domestic feelings.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/a9008e42f48611eab5c010ddb1aba44f.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setName("Superman");
        movie.setDescription("Itself at be answer always exeter up do. Though or my plenty uneasy do. Friendship so considered remarkably be to sentiments.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/11a92826e1a111eaaad910ddb1aba44f.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setName("Hulk");
        movie.setDescription("Offered mention greater fifteen one promise because nor. Why denoting speaking fat indulged saw dwelling raillery.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/d76057e4f57211eab5c010ddb1aba44f.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setName("Robocop");
        movie.setDescription("And sir dare view but over man. So at within mr to simple assure. Mr disposing continued it offending arranging in we.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/068b8300d25111edbb4a0612238522d6.jpeg");
        movies.add(movie);

        movie = new Movie();
        movie.setName("Starwars");
        movie.setDescription("Extremity as if breakfast agreement. Off now mistress provided out horrible opinions. Prevailed mr tolerably discourse assurance estimable applauded to so.");
        movie.setImage("https://flim-1-0-2.s3.eu-central-1.amazonaws.com/thumbs/thumbnail/0520d80ca91d11ec98ab10ddb1aba44f.jpeg");
        movies.add(movie);

        return movies;
    }

}
