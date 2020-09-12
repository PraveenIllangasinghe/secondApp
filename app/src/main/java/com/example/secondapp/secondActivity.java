package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    private String name = "John";
    private int age = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}