package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class HostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,StringArray);

    }
}