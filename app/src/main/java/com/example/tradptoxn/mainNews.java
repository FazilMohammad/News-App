package com.example.tradptoxn;

import java.util.ArrayList;
//this class is to fetch the api data
public class mainNews {
//we have to create a array or a list
    private String status;
    private  String totalResults;
    private ArrayList<ModelClass> articles;//array name is articles to fetch data from api (type of the array is model class and array is articles )

    //Alt+insert--getter and setter
    public mainNews(String status, String totalResults, ArrayList<ModelClass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<ModelClass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<ModelClass> articles) {
        this.articles = articles;
    }
}
