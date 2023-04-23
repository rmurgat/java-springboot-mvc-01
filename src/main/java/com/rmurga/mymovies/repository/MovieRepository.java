package com.rmurga.mymovies.repository;

import com.rmurga.mymovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    //option#1 - @Query(value = "select m from Movie m order by m.name")
    //option#2 (SQL) - @Query(VALUE = "select * from movies m order by m.name", nativeQuery = TRUE)
    @Query("from Movie m order by m.name")
    List<Movie> getallAndOrdered();

    @Query("from Movie m where m.stocklist.id=?1 order by m.name")
    List<Movie> getbyStocklist(int stocklistId);

    //@Query("from Movie m where m.name like %?1%")
    //List<Movie> lookingForNameContaining(String name);

    List<Movie> findByNameContaining(String name);

}
