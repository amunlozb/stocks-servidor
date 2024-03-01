package com.amunlozb.stocksservidor.entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

// Ejemplo del json devuelto para formar este objeto:
// https://polygon.io/docs/stocks/get_v1_open-close__stocksticker___date
@Getter
public class StockPriceResponse {
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("open")
    @Expose
    private Double open;
    @SerializedName("volume")
    @Expose
    private Integer volume;

}
