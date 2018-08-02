package com.example.nishant.tourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setElevation(0);
        }


        ViewPager viewPager=(ViewPager)findViewById(R.id.view_pager);
        SimpleFragmentPageAdapter adapter=new SimpleFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);



    }
}
