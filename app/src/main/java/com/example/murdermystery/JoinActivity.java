package com.example.murdermystery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class JoinActivity extends AppCompatActivity {
    private String code;
    private EditText codeBox;
    boolean codeValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        codeBox = (EditText)findViewById(R.id.code);
    }

    public void goToHostActivity(View view) {
        code = codeBox.getText().toString();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Lobby lobby = null;
        db.collection("lobbies").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot documentSnapshots) {
                        if (documentSnapshots.isEmpty()) {
                            Log.d("ash", "onSuccess: LIST EMPTY");
                            return;
                        } else {
                            // Convert the whole Query Snapshot to a list
                            // of objects directly! No need to fetch each
                            // document.
                            List<Lobby> lobby = documentSnapshots.toObjects(Lobby.class);
                            Log.d("ash",lobby.toString());
                            for(int i = 0;i<lobby.size();i++) {
                                if(lobby!=null){
                                    if(lobby.get(i)!=null) {
                                        if (lobby.get(i).getLobbyCode().equals(code)) {
                                            codeValid = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(), "Error getting data!!!", Toast.LENGTH_LONG).show();
                        }
                    });
        if(codeValid) {
            Intent intent = new Intent(this, HostActivity.class);
            intent.putExtra("lobbyCode",code);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"invalid code",Toast.LENGTH_LONG).show();
        }
    }
}