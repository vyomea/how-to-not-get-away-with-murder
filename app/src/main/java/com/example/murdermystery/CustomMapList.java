package com.example.murdermystery;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 custom list class to store maps
 */
public class CustomMapList extends ArrayAdapter<Map> {
    private ArrayList<Map> maps;
    private Context context;
    public CustomMapList( Context context, ArrayList<Map> maps){
        super(context, 0, maps);
        this.maps = maps;
        this.context = context;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.map_content, parent, false);
        }

        Map map = maps.get(position);

        TextView mapName = view.findViewById(R.id.map_name);
        mapName.setText("map.getName()");
        Log.d("ash",mapName.getText().toString());


        return view;
    }
}
