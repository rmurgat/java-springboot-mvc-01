package com.rmurga.mymovies.repository;

import com.rmurga.mymovies.entity.Movie;
import com.rmurga.mymovies.entity.Stocklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StocklistRepository extends JpaRepository<Stocklist, Integer> {


}
