package com.comp150.frank.tinyapp;


import android.content.Intent;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class PictureViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_viewer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle b = getIntent().getExtras();
        int value = -1; // or other values
        if(b != null)
            value = b.getInt("building");

        ImageView building = (ImageView)findViewById(R.id.buildingViewer);
        switch (value) {
            case 1: building.setImageResource(R.drawable.halligan);
                break;
            case 2: building.setImageResource(R.drawable.library);
                break;
            case 3: building.setImageResource(R.drawable.gym);
                break;
            case 4: building.setImageResource(R.drawable.dewick);
                break;
            case 5: building.setImageResource(R.drawable.carmichael);
                break;
            case 6: building.setImageResource(R.drawable.hodgdon);
                break;
        }
    }

    public void toggleBlackAndWhite(View v) {
        boolean checked = ((CheckBox) v).isChecked();
        ImageView building = (ImageView)findViewById(R.id.buildingViewer);

        if (checked) {
            ColorMatrix matrix = new ColorMatrix();
            matrix.setSaturation(0);

            ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
            building.setColorFilter(filter);
        } else {
            building.clearColorFilter();
        }
    }


    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
    }

}
