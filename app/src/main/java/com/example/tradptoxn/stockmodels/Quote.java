package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Quote {
    @SerializedName("open")
    private List<Double> open = null;
    @SerializedName("close")
    private List<Double> close = null;
    @SerializedName("volume")
    private List<Integer> volume = null;
    @SerializedName("high")
    private List<Double> high = null;
    @SerializedName("low")
    private List<Double> low = null;

    public Quote() {

    }

    public Quote(List<Double> open, List<Double> close, List<Integer> volume, List<Double> high, List<Double> low) {
        this.open = open;
        this.close = close;
        this.volume = volume;
        this.high = high;
        this.low = low;
    }

    public List<Double> getOpen() {
        return open;
    }

    public void setOpen(List<Double> open) {
        this.open = open;
    }

    public List<Double> getClose() {
        return close;
    }

    public void setClose(List<Double> close) {
        this.close = close;
    }

    public List<Integer> getVolume() {
        return volume;
    }

    public void setVolume(List<Integer> volume) {
        this.volume = volume;
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

    @Override
    public String toString() {
        return "Quote{" +
                "open=" + open +
                ", close=" + close +
                ", volume=" + volume +
                ", high=" + high +
                ", low=" + low +
                '}';
    }
}
