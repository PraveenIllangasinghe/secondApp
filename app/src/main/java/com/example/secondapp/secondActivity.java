package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class secondActivity extends AppCompatActivity {

    private int age = 25;

    private String Name = "Harry";
    private int a = 30;
    private int t = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}