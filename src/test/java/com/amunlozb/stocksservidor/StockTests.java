package com.amunlozb.stocksservidor;

import com.amunlozb.stocksservidor.entities.Stock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StockTests {

    private Stock stock;

    // Antes de cada test, se inicializa un Stock con los valores especificados
    @BeforeEach
    public void setUp() {
        stock = new Stock("ticker_Accion", "nombre_Accion", "moneda_Accion", "local_Accion");
    }

    // Test para comprobar que el ticker devuelto por el getter es el esperado
    @Test
    public void test_ticker() {
        assertEquals("ticker_Accion", stock.getTicker());
    }

    // Test para comprobar que el nombre devuelto por el getter es el esperado
    @Test
    public void test_nombre() {
        assertEquals("nombre_Accion", stock.getName());
    }

    // Test para comprobar que la moneda devuelta por el getter es la esperada
    @Test
    public void test_moneda() {
        assertEquals("moneda_Accion", stock.getCurrency_name());
    }

    // Test para comprobar que el locale devuelto por el getter es el esperado
    @Test
    public void test_local() {
        assertEquals("local_Accion", stock.getLocale());
    }
}
