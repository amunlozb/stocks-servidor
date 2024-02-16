package com.amunlozb.stocksservidor.entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("ticker")
    @Expose
    private String ticker;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("market")
    @Expose
    private String market;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("primary_exchange")
    @Expose
    private String primaryExchange;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("currency_name")
    @Expose
    private String currencyName;
    @SerializedName("cik")
    @Expose
    private String cik;
    @SerializedName("composite_figi")
    @Expose
    private String compositeFigi;
    @SerializedName("share_class_figi")
    @Expose
    private String shareClassFigi;
    @SerializedName("last_updated_utc")
    @Expose
    private String lastUpdatedUtc;

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getCompositeFigi() {
        return compositeFigi;
    }

    public void setCompositeFigi(String compositeFigi) {
        this.compositeFigi = compositeFigi;
    }

    public String getShareClassFigi() {
        return shareClassFigi;
    }

    public void setShareClassFigi(String shareClassFigi) {
        this.shareClassFigi = shareClassFigi;
    }

    public String getLastUpdatedUtc() {
        return lastUpdatedUtc;
    }

    public void setLastUpdatedUtc(String lastUpdatedUtc) {
        this.lastUpdatedUtc = lastUpdatedUtc;
    }

}
