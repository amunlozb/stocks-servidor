
package com.amunlozb.stocksservidor.entities.DTO;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

// Ejemplo del json devuelto para formar este objeto:
// https://api.polygon.io/v3/reference/tickers?ticker=NVDA&active=true&apiKey=_PCGPAOGplc_uihoAmAmipQP_by69bSc
@Getter
public class StockResponse {

    @SerializedName("results")
    @Expose
    private List<Result> results;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("request_id")
    @Expose
    private String requestId;
    @SerializedName("count")
    @Expose
    private Integer count;

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}

