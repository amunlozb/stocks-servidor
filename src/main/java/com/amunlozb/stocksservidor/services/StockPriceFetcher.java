package com.amunlozb.stocksservidor.services;

import com.amunlozb.stocksservidor.entities.DTO.StockPriceResponse;
import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Clase que se encarga de hacer la petición a la API de Polygon para obtener el precio de una acción
// Es muy parecida a StockDataFetcher, pero además de la URL, se le pasa la fecha actual (ya que el precio de la acción cambia cada día)
public class StockPriceFetcher {
    private static final String API_KEY = "_PCGPAOGplc_uihoAmAmipQP_by69bSc";
    private static final String API_URL = "https://api.polygon.io/v1/open-close/";

    private static final String API_FECHA = LocalDate.now().minusDays(1).format(DateTimeFormatter.ISO_LOCAL_DATE);

    public static StockPriceResponse fetchStockPrice(String ticker) {
        StockPriceResponse stockResponse = null;
        try {
            // Construyo la URL
            URL url = new URL(API_URL + ticker + "/" + API_FECHA + "?apiKey=" + API_KEY);

            // Abro la conexión
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Leo la respuesta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Parseo la respuesta
            Gson gson = new Gson();
            stockResponse = gson.fromJson(response.toString(), StockPriceResponse.class);

            // Cierro la conexión
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stockResponse;
    }
}
