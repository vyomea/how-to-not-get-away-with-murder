package com.example.murdermystery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;

public class HostActivity extends AppCompatActivity {
    ListView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();
        String userID = mAuth.getCurrentUser().getUid();
        ArrayList<User> participants = new ArrayList<User>();
        participants.add(new User(userID));
        Lobby currentLobby = new Lobby(participants,"bruh",new Map(null, "bruh moment", "jesus",123));
        HashMap<String,Object> lobby = new HashMap<>();
        Map map = new Map(null,"fsdf","sfdfdsfdssf",111);
        map.update();
        lobby.put("bruh",currentLobby);
        db.collection("lobbies").document("bruh").set(currentLobby);
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