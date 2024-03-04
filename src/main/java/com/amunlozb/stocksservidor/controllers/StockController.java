package com.amunlozb.stocksservidor.controllers;

import com.amunlozb.stocksservidor.entities.DTO.StockPriceResponse;
import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.services.StockDataFetcher;
import com.amunlozb.stocksservidor.services.StockPriceFetcher;
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
    @GetMapping("/{ticker}/info")

    public ResponseEntity<?> getTickerInfo(@PathVariable String ticker) {
        // Devuelve el stock con el ticker especificado convertido a mi clase DTO StockResponse
        StockResponse respuesta = StockDataFetcher.fetchStockData(ticker);
        Stock stock = new Stock(respuesta);
        // Lo devuelve como respuesta
        return ResponseEntity.ok(stock);
    }

    @GetMapping("/{ticker}/price")
    // Devuelve el precio de un ticker específico (que se ha pedido como parámetro)
    public ResponseEntity<?> getTickerPrice(@PathVariable String ticker) {
        // Precio del stock con el ticker especificado convertido a mi clase DTO StockPriceResponse
        StockPriceResponse respuesta = StockPriceFetcher.fetchStockPrice(ticker);
        // Lo devuelve como respuesta
        return ResponseEntity.ok(respuesta);
    }

    @GetMapping("filtrarPorZona/{zona}")
    // Basándose en las acciones guardadas en la base de datos, devuelve las que pertenecen a la zona especificada
    // No he hecho que consulte la API externa de polygon.io porque hacen falta demasiadas peticiones para obtener los resultados, y no tengo una cuenta premium.
    public ResponseEntity<?> filtrarPorZona(@PathVariable String zona) {
        return ResponseEntity.ok(stockService.filtrarPorZona(zona));
    }
}
