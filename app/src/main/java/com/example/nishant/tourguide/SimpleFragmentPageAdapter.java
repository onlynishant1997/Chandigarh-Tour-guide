package com.example.nishant.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nishant on 8/17/17.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] {"Hotels","Gardens","Malls","More"};
    public SimpleFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) return new HotelFragment();
        else if(position==1) return new GardenFragment();
        else if(position==2) return new MallsFragment();
        else
        return new OthersFragment();
    }

    @Override
    public int getCount() {
            return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
