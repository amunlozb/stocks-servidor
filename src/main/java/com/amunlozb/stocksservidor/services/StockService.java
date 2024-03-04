package com.amunlozb.stocksservidor.services;

import com.amunlozb.stocksservidor.entities.Stock;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StockService {
    List<Stock> findAll();
    Stock save(Stock stock);

    ResponseEntity<?> findByName(String ticker);

    List<Stock> filtrarPorZona(String zona);
}
