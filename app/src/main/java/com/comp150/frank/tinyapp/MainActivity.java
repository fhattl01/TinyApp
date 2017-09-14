package com.comp150.frank.tinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setHalligan(View v) {
        Intent viewPic = new Intent(this, PictureViewer.class);
        startActivity(viewPic);
    }
}
