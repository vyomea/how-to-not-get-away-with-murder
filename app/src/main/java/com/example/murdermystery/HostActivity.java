package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class HostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        ListView nameListView = findViewById(R.id.usernameListView);
        TextView nameTextView = findViewById(R.id.nameTextView);
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Volvo");
        nameList.add("BMW");
        nameList.add("Ford");
        nameList.add("Mazda");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, android.R.id.text1, nameList);
        nameListView.setAdapter(adapter);

        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,StringArray);



    }
}