package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);
    }
    public void sendToRoomActivity(View view){
        Intent intent = new Intent (this, RoomGeneratorActivity.class);
        startActivity(intent);
    }
}