package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToCreateActivity(View view) {
        Intent intent = new Intent(this,CreateActivity.class);
        startActivity(intent);
    }

    public void goToJoinActivity(View view) {
        Intent intent = new Intent(this,JoinActivity.class);
        startActivity(intent);
    }

    public void goToHostActivity(View view) {
        Intent intent = new Intent(this,HostActivity.class);
        startActivity(intent);
    }


    }