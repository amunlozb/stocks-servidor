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
        // Devuelve el stock con el ticker especificado convertido a mi clase DTO StockResponse
        StockResponse respuesta = StockDataFetcher.fetchStockData(ticker);
        // Lo devuelve como respuesta
        return ResponseEntity.ok(respuesta);
    }

}
