package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {
    @SerializedName("meta")
    private Meta meta;
    @SerializedName("timestamp")
    private List<Integer> timestamp = null;
    @SerializedName("comparisons")
    private List<Comparison> comparisons = null;
    @SerializedName("indicators")
    private Indicators indicators;

    public Result() {
    }

    public Result(Meta meta, List<Integer> timestamp, List<Comparison> comparisons, Indicators indicators) {
        this.meta = meta;
        this.timestamp = timestamp;
        this.comparisons = comparisons;
        this.indicators = indicators;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Integer> getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(List<Integer> timestamp) {
        this.timestamp = timestamp;
    }

    public List<Comparison> getComparisons() {
        return comparisons;
    }

    public void setComparisons(List<Comparison> comparisons) {
        this.comparisons = comparisons;
    }

    public Indicators getIndicators() {
        return indicators;
    }

    public void setIndicators(Indicators indicators) {
        this.indicators = indicators;
    }

    @Override
    public String toString() {
        return "Result{" +
                "meta=" + meta +
                ", timestamp=" + timestamp +
                ", comparisons=" + comparisons +
                ", indicators=" + indicators +
                '}';
    }

}
