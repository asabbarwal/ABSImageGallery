package com.abhisheksabbarwal.absimagegallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class DisplayFullImage extends Activity{

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock_Light_DarkActionBar);
        setContentView(R.layout.fullscr_swipe_scroll);
        
        Intent i = getIntent();
        
        int position = i.getExtras().getInt("id");
        
        ViewPager pager = (ViewPager) findViewById(R.id.mypanelpager);
        
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);
        
        pager.setAdapter(adapter);
        
        System.out.println(position+"is clicked");
        
        pager.setCurrentItem(position);
        
    }
}
