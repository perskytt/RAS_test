package com.example.per.ras_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Per on 2015-03-09.
 */
public class MainActivity extends Activity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button viewRouteBtn, plRouteBtn;
        viewRouteBtn = (Button)findViewById(R.id.viewRouteBtn);
        plRouteBtn = (Button)findViewById(R.id.plRouteBtn);
        viewRouteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(i);
            }
        });
        plRouteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(i);
            }
        });
        }

    public void sendMessage(View view) {
        Intent myIntent = new Intent(MainActivity.this, MapsActivity.class);
        startActivityForResult(myIntent, 0);
    }

    @Override
    public void onClick(View v) {

    }
}
