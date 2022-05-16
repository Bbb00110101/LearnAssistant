package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DefActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_def3);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void startFirstQuizActivity(View v){
        Intent intent = new Intent(this, QuizActivity1.class);
        startActivity(intent);
    }
    public void startSecondQuizActivity(View v){
        Intent intent = new Intent(this, QuizActivity2.class);
        startActivity(intent);
    }
    public void startThirdQuizActivity(View v){
        Intent intent = new Intent(this, QuizActivity3.class);
        startActivity(intent);
    }
    public void startFourthQuizActivity(View v){
        Intent intent = new Intent(this, QuizActivity4.class);
        startActivity(intent);
    }
}