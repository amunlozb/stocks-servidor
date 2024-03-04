package com.amunlozb.stocksservidor.services.impl;

import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.repositories.StockRepository;
import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    // Devuelve el stock con el ticker especificado convertido a mi clase DTO StockResponse
    @Override
    public ResponseEntity<?> findByName(String ticker) {
        Stock stock = stockRepository.findById(ticker).orElse(null);
        return ResponseEntity.ok(stock);
    }

    // Basándose en las acciones guardadas en la base de datos, devuelve las que pertenecen a la zona (locale) especificada (us, cn, eu)
    @Override
    public List<Stock> filtrarPorZona(String zona) {
        // Si la zona es us, cn o eu, devuelve las acciones de esa zona
        if (Objects.equals(zona, "us") || Objects.equals(zona, "cn") || Objects.equals(zona, "eu")) {
            return stockRepository.findByLocale(zona);
        }
        return null;
    }
}
