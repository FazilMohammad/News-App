package com.example.tradptoxn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.tradptoxn.stockmodels.StockChartData;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StockChartss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_chartss);
        getStockChartData();

        BottomNavigationView bottomNavigationView = findViewById (R.id.bottom_navigation);
//Set Home Selected
        bottomNavigationView.setSelectedItemId (R.id.home);
//Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext()
                                ,BottomNavigationView.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.fhome:
                        return true;

                    case R.id.news:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }


    private void getStockChartData() {
        ApiUtilites.getApiInterface(ApiInterface.STARTCHARTURL).getStockChartsData("MSFT,^VIX", "1d", "IN", "en", "div,split", "AAPL", "zW6sTOTQq683enA3eWSIa8iS3nxjxOPva5NazZNp").enqueue(new Callback<StockChartData>() {
            @Override
            public void onResponse(@NonNull Call<StockChartData> call, @NonNull Response<StockChartData> response) {
                if (response.isSuccessful()) {
                    Log.d("tag", "onResponse: " + response);
                    assert response.body() != null;
                    Log.d("tag", "onResponse: " + response.body().getChart());

                }
            }

            @Override
            public void onFailure(@NonNull Call<StockChartData> call, @NonNull Throwable t) {
                Log.d("tag", "onFailure: " + t);
            }
        });


    }
}