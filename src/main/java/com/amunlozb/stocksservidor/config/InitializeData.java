package com.amunlozb.stocksservidor.config;

import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeData implements CommandLineRunner {

    @Autowired
    private StockService stockService;

    @Override
    public void run(String... args) throws Exception {
        try {
            // Datos de ejemplo
            Stock stock1 = new Stock("AAPL", "Apple Inc.", "usd", "us");
            Stock stock2 = new Stock("NVDA", "Nvidia Corp.", "usd", "us");
            stockService.save(stock1);
            stockService.save(stock2);
            System.out.println("Datos cargados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
