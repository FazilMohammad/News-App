package com.example.tradptoxn;
//this is an Api interface--The interface is like a Class. The interface keyword is used to declare an interface.
import com.example.tradptoxn.stockmodels.StockChartData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiInterface {

    //In string variable we need to pass our base url
    //we need base url for the api to work
    String BASE_URL="https://newsapi.org/v2/";
    String STARTCHARTURL="https://yfapi.net/v8/finance/chart/AAPL/";

    //we have get two things first the headlines and then we need to fetch the headlines of the specific news

    //first fetch top headlines
    @GET("https://newsapi.org/v2/")
    Call<mainNews> getNews(  //we call our main news java class type
            //inside this we need pass 3 parameters (make sure we type same variable present in api documentation)
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

    //headlines of the specific news category
    @GET("https://newsapi.org/v2/")
    Call<mainNews> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );
    @GET("https://yfapi.net/v8/finance/chart/AAPL")
    Call<StockChartData> getStockChartsData(
            @Query("comparisons") String comparisons,
            @Query("range") String range,
            @Query("region") String region,
            @Query("lang") String lang,
            @Query("events") String events,
            @Query("ticker") String ticker,
            @Header("x-api-key") String apikey
    );
}
