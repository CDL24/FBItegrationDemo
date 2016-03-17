package com.example.climbachiya.fbintegrationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Add Fragment
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
    }
}
