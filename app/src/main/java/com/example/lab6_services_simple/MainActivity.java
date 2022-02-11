package com.example.lab6_services_simple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartClicked(View view) {
        Intent intent = new Intent(MainActivity.this, DemoService.class);
        startService(intent);
    }

    public void onStopClicked(View view){
        Intent intent = new Intent(MainActivity.this, DemoService.class);
        stopService(intent);
    }


}