package com.example.ahmedelbasha.tourisminegypt;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);

        PlaceTypeFragmentStatePagerAdapter adapter = new PlaceTypeFragmentStatePagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.slidingTabs);

        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabTextColors(Color.parseColor("#80ffffff"), Color.parseColor("#FFFFFF"));

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
    }
}
