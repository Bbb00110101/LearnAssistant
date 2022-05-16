package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void startFirstDefActivity(View v){
        Intent intent = new Intent(this, DefActivity1.class);
        startActivity(intent);
    }
    public void startSecondDefActivity(View v){
        Intent intent = new Intent(this, DefActivity2.class);
        startActivity(intent);
    }
    public void startThirdDefActivity(View v){
        Intent intent = new Intent(this, DefActivity3.class);
        startActivity(intent);
    }
}