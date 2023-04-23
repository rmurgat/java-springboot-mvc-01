package com.rmurga.mymovies.service;

import com.rmurga.mymovies.entity.Stocklist;
import com.rmurga.mymovies.repository.StocklistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocklistService {
    private final StocklistRepository stocklistRepository;

    public StocklistService(StocklistRepository stocklistRepository) {
        this.stocklistRepository = stocklistRepository;
    }

    public List<Stocklist> getAllStocklist() {
        return stocklistRepository.findAll();
    }
}
