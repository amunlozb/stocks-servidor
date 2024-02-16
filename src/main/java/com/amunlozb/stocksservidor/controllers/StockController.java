package com.amunlozb.stocksservidor.controllers;

import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import com.amunlozb.stocksservidor.services.StockDataFetcher;
import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    // Devuelve los detalles de un ticker específico (que se ha pedido como parámetro)
    @GetMapping("/{ticker}")

    public ResponseEntity<?> getTickerInfo(@PathVariable String ticker) {
        StockResponse respuesta = StockDataFetcher.fetchStockData(ticker);
        return ResponseEntity.ok(respuesta);
    }

}
