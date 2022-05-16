package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TeorActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teor2);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, DefActivity1.class);
        startActivity(intent);
    }
}