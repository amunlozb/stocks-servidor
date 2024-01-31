package com.amunlozb.stocksservidor.controllers;

import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {
    @Autowired
    private StockService stockService;

    // Devuelve los detalles de un ticker específico (que se ha pedido como parámetro)
    @GetMapping
    public ResponseEntity<?> getTickerInfo(@RequestParam(value = "ticker", required = true) String ticker) {

    }
}
