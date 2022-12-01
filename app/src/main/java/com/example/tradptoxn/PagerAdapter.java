package com.example.tradptoxn;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tradptoxn.newsFragments.BusinessFragment;
import com.example.tradptoxn.newsFragments.HealthFragment;
import com.example.tradptoxn.newsFragments.HomeFragment;
import com.example.tradptoxn.newsFragments.SportsFragment;
import com.example.tradptoxn.newsFragments.TechnologyFragment;

//we use Pager Adapter class to handle all fragments
//there is a line on fragmentpagerAdapter because it is deprecated method
public class PagerAdapter extends FragmentPagerAdapter {

    //we take a variable here it simply returns the tab count
    int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

//below we are switching the positions
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            //we need to see the Fragments and pass the order
            case 0:
                return new HomeFragment();

                case 1:
                return new SportsFragment();

            case 2:
                return new HealthFragment();

            case 3:
                return new TechnologyFragment();

                case 4:
                return new BusinessFragment();

            default:
                return null;



        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
