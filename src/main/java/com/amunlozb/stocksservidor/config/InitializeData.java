package com.amunlozb.stocksservidor.config;

import com.amunlozb.stocksservidor.entities.Auth.Role;
import com.amunlozb.stocksservidor.entities.Auth.User;
import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.repositories.UserRepository;
import com.amunlozb.stocksservidor.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitializeData implements CommandLineRunner {

    @Autowired
    private StockService stockService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        try {
            // --- Datos de ejemplo ----

            // America (locale: us)
            Stock stock1 = new Stock("AAPL", "Apple Inc.", "usd", "us");
            Stock stock2 = new Stock("NVDA", "Nvidia Corp.", "usd", "us");
            Stock stock3 = new Stock("GOOGL", "Alphabet Inc.", "usd", "us");
            Stock stock4 = new Stock("AMZN", "Amazon.com, Inc.", "usd", "us");
            Stock stock5 = new Stock("MSFT", "Microsoft Corporation", "usd", "us");
            Stock stock6 = new Stock("FB", "Facebook, Inc.", "usd", "us");
            Stock stock7 = new Stock("TSLA", "Tesla, Inc.", "usd", "us");
            Stock stock9 = new Stock("V", "Visa Inc.", "usd", "us");
            Stock stock10 = new Stock("JPM", "JPMorgan Chase & Co.", "usd", "us");
            Stock stock11 = new Stock("JNJ", "Johnson & Johnson", "usd", "us");
            Stock stock12 = new Stock("WMT", "Walmart Inc.", "usd", "us");

            // Europa (locale: eu)
            Stock stock13 = new Stock("SAP", "SAP SE", "eur", "eu");
            Stock stock14 = new Stock("ADS", "Adidas AG", "eur", "eu");
            Stock stock15 = new Stock("ALV", "Allianz SE", "eur", "eu");
            Stock stock16 = new Stock("BAS", "BASF SE", "eur", "eu");
            Stock stock17 = new Stock("BMW", "Bayerische Motoren Werke AG", "eur", "eu");

            // China (locale: cn)
            Stock stock8 = new Stock("BABA", "Alibaba Group Holding Limited", "usd", "cn");
            Stock stock18 = new Stock("600519", "Kweichow Moutai Co., Ltd.", "cny", "cn");
            Stock stock19 = new Stock("601318", "Ping An Insurance (Group) Company of China, Ltd.", "cny", "cn");
            Stock stock20 = new Stock("601398", "Industrial and Commercial Bank of China Limited", "cny", "cn");
            Stock stock21 = new Stock("601857", "PetroChina Company Limited", "cny", "cn");

            // Guardar en la base de datos
            stockService.save(stock1);
            stockService.save(stock2);
            stockService.save(stock3);
            stockService.save(stock4);
            stockService.save(stock5);
            stockService.save(stock6);
            stockService.save(stock7);
            stockService.save(stock8);
            stockService.save(stock9);
            stockService.save(stock10);
            stockService.save(stock11);
            stockService.save(stock12);
            stockService.save(stock13);
            stockService.save(stock14);
            stockService.save(stock15);
            stockService.save(stock16);
            stockService.save(stock17);
            stockService.save(stock18);
            stockService.save(stock19);
            stockService.save(stock20);
            stockService.save(stock21);

            System.out.println("Datos cargados correctamente.");

            // ---- Usuarios ----

            // Usuario 1 - Rol USER
            User usuario1 = new User();
            usuario1.setFirstName("Alice");
            usuario1.setLastName("Smith");
            usuario1.setEmail("alice.smith@example.com");
            usuario1.setPassword(passwordEncoder.encode("password123"));
            usuario1.getRoles().add(Role.ROLE_USER);
            userRepository.save(usuario1);

           // Usuario 2 - Rol ADMIN
            User usuario2 = new User();
            usuario2.setFirstName("Bob");
            usuario2.setLastName("Smith");
            usuario2.setEmail("bob.smith@example.com");
            usuario2.setPassword(passwordEncoder.encode("password456"));
            usuario2.getRoles().add(Role.ROLE_ADMIN);
            userRepository.save(usuario2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
