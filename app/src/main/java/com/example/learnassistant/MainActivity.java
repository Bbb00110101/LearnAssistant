package com.example.learnassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    public void startSetActivity(View v){
        Intent intent = new Intent(this, SetActivity1.class);
        startActivity(intent);

    }
}