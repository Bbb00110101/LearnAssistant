package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DefActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def1);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void startFirstTeorActivity(View v){
        Intent intent = new Intent(this, TeorActivity1.class);
        startActivity(intent);
    }
    public void startSecondTeorActivity(View v){
        Intent intent = new Intent(this, TeorActivity2.class);
        startActivity(intent);
    }
    public void startThirdTeorActivity(View v){
        Intent intent = new Intent(this, TeorActivity3.class);
        startActivity(intent);
    }
    public void startFourthTeorActivity(View v){
        Intent intent = new Intent(this, TeorActivity4.class);
        startActivity(intent);
    }
}