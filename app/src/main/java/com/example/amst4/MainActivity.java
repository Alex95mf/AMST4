package com.example.amst4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*final FloatingActionButton map_btn = (FloatingActionButton) findViewById(R.id.map_btn);
    map_btn.setOnClickListener((view) -> {
        Intent intent = new Intent (packageContext: MainActivity.this. Maps.class);
        startActivity(intent);
    });*/
}