package com.example.tradptoxn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
//simply take varibles here and name them
    TabLayout tabLayout;
    BottomNavigationItemView mhome,mhealth,msports,mtech,mbusiness,mstock;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;

    //storing our api key by declaring a string type variable
    String api="e48c158b1c884e0b9f1d80ddaeff2c09";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//below we have assigned xml id to java id
        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        mhome = findViewById(R.id.home);
        mstock = findViewById(R.id.Stock);
        msports = findViewById(R.id.sports);
        mhealth = findViewById(R.id.health);
        mtech = findViewById(R.id.technology);
        mbusiness=findViewById(R.id.business);
        //now first we need to declare a viewpager type
        ViewPager viewPager = findViewById(R.id.fragmentContainer);
        tabLayout = findViewById(R.id.include);

        BottomNavigationView bottomNavigationView = findViewById (R.id.bottom_navigation);
//Set Home Selected
        bottomNavigationView.setSelectedItemId (R.id.news);
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
                        startActivity(new Intent(getApplicationContext()
                                ,StockChartss.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.news:
                        return true;
                }
                return false;
            }
        });

//we need to set the pager Adapter and we need to pass the number of fragments
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 5);
        viewPager.setAdapter(pagerAdapter);

        //below code is use is when a user click on one specific fragment ,one that fragment should open (we should allow th user to swipe and also by clicking on it )
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4) {
                    pagerAdapter.notifyDataSetChanged();//this is used to notify our adapter
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }
}

