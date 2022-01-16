package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SelectMap extends AppCompatActivity {

    ListView mapList;
    ArrayAdapter<Map> mapsAdapter;
    ArrayList<Map> mapsList;
    Button selectMapButton;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_map);
        mapList = findViewById(R.id.map_list);
        mapsList = new ArrayList<>();
        mapsList.add(new Map(null,"cardi b is trash","bruhh",100));
        mapsList.add(new Map(null,"billie eilish is trash","hhhhhhh",101));
        mapsAdapter = new CustomMapList(this, mapsList);
        mapList.setAdapter(mapsAdapter);
        mapList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                pos = position;

                Button selectButton = findViewById(R.id.confirm_button);
                selectButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (pos < mapList.getCount() && pos >= 0) {
                            Map map = mapsAdapter.getItem(pos);
                            Intent intent = new Intent (view.getContext(), HostActivity.class);
                            intent.putExtra("selectedMap",map.getId());
                            startActivity(intent);
                        }
                    }
                });
                Button viewButton = findViewById(R.id.viewDescription);
                viewButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (pos < mapList.getCount() && pos >= 0) {
                            Map map = mapsAdapter.getItem(pos);
                            Intent intent = new Intent (view.getContext(), ShowDescription.class);
                            intent.putExtra("description",map.getDescription());
                            startActivity(intent);

                        }
                    }
                });
            }
        });
    }

}