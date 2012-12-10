package com.abhisheksabbarwal.absimagegallery;

import com.actionbarsherlock.app.SherlockActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.view.*;


public class MainActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_Sherlock_Light_DarkActionBar);
        setContentView(R.layout.activity_main);
        
        GridView imageGridView = (GridView) findViewById (R.id.gridview);
        
        imageGridView.setAdapter(new ImageAdapter(this));
        
        imageGridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            	Intent i = new Intent(getApplicationContext(), DisplayFullImage.class);
            	//Intent i = new Intent(getApplicationContext(), FullImageDisplayActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}