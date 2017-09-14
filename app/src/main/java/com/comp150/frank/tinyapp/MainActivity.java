package com.comp150.frank.tinyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setHalligan(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 1);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void setLibrary(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 2);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void setGym(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 3);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void setDewick(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 4);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void setCarmichael(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 5);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }

    public void setHodgdon(View v) {
        Intent intent = new Intent(MainActivity.this, PictureViewer.class);
        Bundle b = new Bundle();
        b.putInt("building", 6);
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}
