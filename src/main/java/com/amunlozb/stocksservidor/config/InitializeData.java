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
            // Datos de ejemplo
            Stock stock1 = new Stock("AAPL", "Apple Inc.", "usd", "us");
            Stock stock2 = new Stock("NVDA", "Nvidia Corp.", "usd", "us");
            stockService.save(stock1);
            stockService.save(stock2);
            System.out.println("Datos cargados correctamente.");
            // Usuarios
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
