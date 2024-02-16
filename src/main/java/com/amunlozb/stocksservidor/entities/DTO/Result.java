package com.amunlozb.stocksservidor.entities.DTO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public void setCompositeFigi(String compositeFigi) {
        this.compositeFigi = compositeFigi;
    }

    public void setShareClassFigi(String shareClassFigi) {
        this.shareClassFigi = shareClassFigi;
    }

    public void setLastUpdatedUtc(String lastUpdatedUtc) {
        this.lastUpdatedUtc = lastUpdatedUtc;
    }

}
