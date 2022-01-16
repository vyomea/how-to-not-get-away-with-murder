package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HostActivity extends AppCompatActivity {
    ListView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,StringArray);
        Bundle extras = getIntent().getExtras();
        int mapId = 0;
        if (extras != null) {
            mapId = extras.getInt("selectedMap");
            //The key argument here must match that used in the other activity
        }
        if(mapId!=0){
            TextView mapName = this.findViewById(R.id.textView);
            mapName.setText(String.valueOf(mapId));
        }
    }

    public void goToSelectActivity (View view){
        Intent intent = new Intent (this, SelectMap.class);
        startActivity(intent);
    }
}