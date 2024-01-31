package com.amunlozb.stocksservidor.services;

import com.amunlozb.stocksservidor.entities.Stock;

import java.util.List;

public interface StockService {
    List<Stock> findAll();
    Stock save(Stock stock);

}
