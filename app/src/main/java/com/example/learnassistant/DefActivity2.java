package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DefActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def2);
    }
    public void goBack(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}