package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    private int age = 25;

    private String Name = "Ben";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}