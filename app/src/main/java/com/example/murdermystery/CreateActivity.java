package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }
    public void goToCanvasActivity(View view){
        Intent intent = new Intent (this, CanvasActivity.class);
        startActivity(intent);
    }

}