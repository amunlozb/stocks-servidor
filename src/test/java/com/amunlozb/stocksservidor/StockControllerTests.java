package com.amunlozb.stocksservidor;

import com.amunlozb.stocksservidor.controllers.StockController;
import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import com.amunlozb.stocksservidor.entities.Stock;
import com.amunlozb.stocksservidor.services.StockDataFetcher;
import com.amunlozb.stocksservidor.services.StockService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ExtendWith(MockitoExtension.class)
public class StockControllerTests {
    @Mock
    private StockService stockService;

    @InjectMocks
    private StockController stockController;

    private MockMvc mockMvc;

    // Antes que nada, se inicializa el MockMvc
    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(stockController).build();
    }

    // Test para comprobar que el los datos devueltos por la API tienen el formato correcto
    @Test
    public void test_getTickerInfo_devuelve_json() throws Exception {
        mockMvc.perform(get("/api/v1/stocks/{ticker}", "AAPL"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
