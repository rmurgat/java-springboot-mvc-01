package com.rmurga.mymovies.repository;

import com.rmurga.mymovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
