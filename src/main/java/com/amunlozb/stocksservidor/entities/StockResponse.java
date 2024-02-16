
package com.amunlozb.stocksservidor.entities;

import java.util.List;
import javax.xml.transform.Result;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// Ejemplo del json devuelto para formar este objeto:
// https://api.polygon.io/v3/reference/tickers?ticker=NVDA&active=true&apiKey=_PCGPAOGplc_uihoAmAmipQP_by69bSc
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

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
