package com.amunlozb.stocksservidor.services;
import com.amunlozb.stocksservidor.entities.DTO.StockResponse;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class StockDataFetcher {
    private static final String API_KEY = "_PCGPAOGplc_uihoAmAmipQP_by69bSc";
    private static final String API_URL = "https://api.polygon.io/v3/reference/tickers";

    public static StockResponse fetchStockData(String ticker) {
        StockResponse stockResponse = null;
        try {
            // Construyo la URL
            URL url = new URL(API_URL + "?ticker=" + ticker + "&active=true&apiKey=" + API_KEY);

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
            stockResponse = gson.fromJson(response.toString(), StockResponse.class);

            // Cierro la conexión
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stockResponse;
    }
}
