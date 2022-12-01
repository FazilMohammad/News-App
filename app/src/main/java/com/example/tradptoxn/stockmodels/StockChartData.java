package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

public class StockChartData {
        @SerializedName("chart")
        private Chart chart;

    public StockChartData() {
    }

    public StockChartData(Chart chart) {
        this.chart = chart;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    @Override
    public String toString() {
        return "StockChartData{" +
                "chart=" + chart +
                '}';
    }
}

