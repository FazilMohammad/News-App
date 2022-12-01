package com.example.tradptoxn.stockmodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Chart {
    @SerializedName("result")
    private List<Result> result = null;
    @SerializedName("error")
    private Object error;

    public Chart() {
    }


    public Chart(List<Result> result, Object error) {
        this.result = result;
        this.error = error;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Charts{" +
                "result=" + result +
                ", error=" + error +
                '}';
    }
}
