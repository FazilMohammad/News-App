package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Comparison {
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("previousClose")
    private Double previousClose;
    @SerializedName("gmtoffset")
    private Integer gmtoffset;
    @SerializedName("high")
    private List<Double> high = null;
    @SerializedName("low")
    private List<Double> low = null;
    @SerializedName("chartPreviousClose")
    private Double chartPreviousClose;
    @SerializedName("close")
    private List<Double> close = null;
    @SerializedName("open")
    private List<Double> open = null;

    public Comparison() {
    }

    public Comparison(String symbol, Double previousClose, Integer gmtoffset, List<Double> high, List<Double> low, Double chartPreviousClose, List<Double> close, List<Double> open) {
        this.symbol = symbol;
        this.previousClose = previousClose;
        this.gmtoffset = gmtoffset;
        this.high = high;
        this.low = low;
        this.chartPreviousClose = chartPreviousClose;
        this.close = close;
        this.open = open;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Integer getGmtoffset() {
        return gmtoffset;
    }

    public void setGmtoffset(Integer gmtoffset) {
        this.gmtoffset = gmtoffset;
    }

    public List<Double> getHigh() {
        return high;
    }

    public void setHigh(List<Double> high) {
        this.high = high;
    }

    public List<Double> getLow() {
        return low;
    }

    public void setLow(List<Double> low) {
        this.low = low;
    }

    public Double getChartPreviousClose() {
        return chartPreviousClose;
    }

    public void setChartPreviousClose(Double chartPreviousClose) {
        this.chartPreviousClose = chartPreviousClose;
    }

    public List<Double> getClose() {
        return close;
    }

    public void setClose(List<Double> close) {
        this.close = close;
    }

    public List<Double> getOpen() {
        return open;
    }

    public void setOpen(List<Double> open) {
        this.open = open;
    }

    @Override
    public String toString() {
        return "Comparison{" +
                "symbol='" + symbol + '\'' +
                ", previousClose=" + previousClose +
                ", gmtoffset=" + gmtoffset +
                ", high=" + high +
                ", low=" + low +
                ", chartPreviousClose=" + chartPreviousClose +
                ", close=" + close +
                ", open=" + open +
                '}';
    }
}
