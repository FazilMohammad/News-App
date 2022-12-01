package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Meta {
    @SerializedName("currency")
    private String currency;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("exchangeName")
    private String exchangeName;
    @SerializedName("instrumentType")
    private String instrumentType;
    private Integer firstTradeDate;
    @SerializedName("regularMarketTime")
    private Integer regularMarketTime;
    @SerializedName("gmtoffset")
    private Integer gmtoffset;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("exchangeTimezoneName")
    private String exchangeTimezoneName;
    @SerializedName("regularMarketPrice")
    private Double regularMarketPrice;
    @SerializedName("chartPreviousClose")
    private Double chartPreviousClose;
    @SerializedName("previousClose")
    private Double previousClose;
    @SerializedName("scale")
    private Integer scale;
    @SerializedName("priceHint")
    private Integer priceHint;
    @SerializedName("currentTradingPeriod")
    private CurrentTradingPeriod currentTradingPeriod;
    @SerializedName("tradingPeriods")
    private List<List<TradingPeriod>> tradingPeriods = null;
    private String dataGranularity;
    @SerializedName("range")
    private String range;
    @SerializedName("validRanges")
    private List<String> validRanges = null;

    public Meta() {

    }

    public Meta(String currency, String symbol, String exchangeName, String instrumentType, Integer firstTradeDate, Integer regularMarketTime, Integer gmtoffset, String timezone, String exchangeTimezoneName, Double regularMarketPrice, Double chartPreviousClose, Double previousClose, Integer scale, Integer priceHint, CurrentTradingPeriod currentTradingPeriod, List<List<TradingPeriod>> tradingPeriods, String dataGranularity, String range, List<String> validRanges) {

        this.currency = currency;
        this.symbol = symbol;
        this.exchangeName = exchangeName;
        this.instrumentType = instrumentType;
        this.firstTradeDate = firstTradeDate;
        this.regularMarketTime = regularMarketTime;
        this.gmtoffset = gmtoffset;
        this.timezone = timezone;
        this.exchangeTimezoneName = exchangeTimezoneName;
        this.regularMarketPrice = regularMarketPrice;
        this.chartPreviousClose = chartPreviousClose;
        this.previousClose = previousClose;
        this.scale = scale;
        this.priceHint = priceHint;
        this.currentTradingPeriod = currentTradingPeriod;
        this.tradingPeriods = tradingPeriods;
        this.dataGranularity = dataGranularity;
        this.range = range;
        this.validRanges = validRanges;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Integer getFirstTradeDate() {
        return firstTradeDate;
    }

    public void setFirstTradeDate(Integer firstTradeDate) {
        this.firstTradeDate = firstTradeDate;
    }

    public Integer getRegularMarketTime() {
        return regularMarketTime;
    }

    public void setRegularMarketTime(Integer regularMarketTime) {
        this.regularMarketTime = regularMarketTime;
    }

    public Integer getGmtoffset() {
        return gmtoffset;
    }

    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getExchangeTimezoneName() {
        return exchangeTimezoneName;
    }

    public void setExchangeTimezoneName(String exchangeTimezoneName) {
        this.exchangeTimezoneName = exchangeTimezoneName;
    }

    public Double getRegularMarketPrice() {
        return regularMarketPrice;
    }

    public void setRegularMarketPrice(Double regularMarketPrice) {
        this.regularMarketPrice = regularMarketPrice;
    }

    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getPriceHint() {
        return priceHint;
    }

    public void setPriceHint(Integer priceHint) {
        this.priceHint = priceHint;
    }

    public CurrentTradingPeriod getCurrentTradingPeriod() {
        return currentTradingPeriod;
    }

    public void setCurrentTradingPeriod(CurrentTradingPeriod currentTradingPeriod) {
        this.currentTradingPeriod = currentTradingPeriod;
    }

    public List<List<TradingPeriod>> getTradingPeriods() {
        return tradingPeriods;
    }

    public void setTradingPeriods(List<List<TradingPeriod>> tradingPeriods) {
        this.tradingPeriods = tradingPeriods;
    }

    public String getDataGranularity() {
        return dataGranularity;
    }

    public void setDataGranularity(String dataGranularity) {
        this.dataGranularity = dataGranularity;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public List<String> getValidRanges() {
        return validRanges;
    }

    public void setValidRanges(List<String> validRanges) {
        this.validRanges = validRanges;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "currency='" + currency + '\'' +
                ", symbol='" + symbol + '\'' +
                ", exchangeName='" + exchangeName + '\'' +
                ", instrumentType='" + instrumentType + '\'' +
                ", firstTradeDate=" + firstTradeDate +
                ", regularMarketTime=" + regularMarketTime +
                ", gmtoffset=" + gmtoffset +
                ", timezone='" + timezone + '\'' +
                ", exchangeTimezoneName='" + exchangeTimezoneName + '\'' +
                ", regularMarketPrice=" + regularMarketPrice +
                ", chartPreviousClose=" + chartPreviousClose +
                ", previousClose=" + previousClose +
                ", scale=" + scale +
                ", priceHint=" + priceHint +
                ", currentTradingPeriod=" + currentTradingPeriod +
                ", tradingPeriods=" + tradingPeriods +
                ", dataGranularity='" + dataGranularity + '\'' +
                ", range='" + range + '\'' +
                ", validRanges=" + validRanges +
                '}';
    }
}
