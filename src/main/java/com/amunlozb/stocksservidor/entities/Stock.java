package com.amunlozb.stocksservidor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Stock {
    // Nombre abreviado de la empresa. Ejemplo: "NVDA", "AAPL".
    @Id
    private String ticker;
    // Nombre completo de la empresa. Ejemplo: "Nvidia Corp", "Apple Inc."
    private String name;
    // Nombre de la moneza utilizada. Ejemplo: "usd", "eur".
    private String currency_name;
    // Nombre de la localización. Ejemplo: "us", "eu".
    private String locale;
}
