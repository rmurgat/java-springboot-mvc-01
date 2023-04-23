package com.rmurga.mymovies.repository;

import com.rmurga.mymovies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {


    @Query("from Movie m order by m.name")
    //  @Query(value = "select m from Movie m order by m.name")
    //  @Query(VALUE = "select * from movies m order by m.name", nativeQuery = TRUE)
    List<Movie> getallAndOrdered();

    @Query("from Movie m where m.stocklist.id=?1 order by m.name")
    List<Movie> getbyStocklist(int stocklistId);


}
