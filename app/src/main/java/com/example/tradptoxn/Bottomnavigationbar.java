package com.example.tradptoxn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottomnavigationbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigationbar);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById (R.id.bottom_navigation);
//Set Home Selected
        bottomNavigationView.setSelectedItemId (R.id.dashboard);
//Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.dashboard:
                        return true;

                    case R.id.fhome:
                        startActivity(new Intent(getApplicationContext()
                                ,StockChartss.class));
                        overridePendingTransition(0,0);
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
}