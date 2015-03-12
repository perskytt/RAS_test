package com.example.per.ras_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.view.MenuItem;
import android.widget.Button;
import static android.support.v4.app.ActivityCompat.startActivity;


public class MainActivity extends Activity {










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button plnRtBtn = (Button)findViewById(R.id.plnRtBtn);
        Button vwRtBtn = (Button)findViewById(R.id.vwRtBtn);

        plnRtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });
        vwRtBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, MapsActivity.class));
                }
            });
    }


    public void click(View view) {
    }
}
