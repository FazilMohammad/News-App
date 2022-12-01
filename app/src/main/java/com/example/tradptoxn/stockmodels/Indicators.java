package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Indicators {
    @SerializedName("quote")
    private List<Quote> quote = null;

    public Indicators() {
    }

    public Indicators(List<Quote> quote) {
        this.quote = quote;
    }

    public List<Quote> getQuote() {
        return quote;
    }

    public void setQuote(List<Quote> quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Indicators{" +
                "quote=" + quote +
                '}';
    }
}
