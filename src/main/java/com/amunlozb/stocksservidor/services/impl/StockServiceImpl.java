package com.amunlozb.stocksservidor.services.impl;

import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.repositories.StockRepository;
import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;
    @Override
    public List<Stock> findAll() {
        return(stockRepository.findAll());
    }

    @Override
    public Stock save(Stock stock) {
        return (stockRepository.save(stock));
    }

    @Override
    public ResponseEntity<?> findByName(String ticker) {
        Stock stock = stockRepository.findById(ticker).orElse(null);
        return ResponseEntity.ok(stock);
    }
}
