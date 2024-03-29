package com.example.boostit.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.boostit.R;
import com.google.firebase.auth.FirebaseAuth;

public class HomeCouch extends AppCompatActivity {

    Button                          btnLogOut;
//    FirebaseAuth                    fAuth;
//    FirebaseAuth.AuthStateListener  mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_couch);

        btnLogOut = findViewById(R.id.btnLogOutCoach);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), LogIn.class));
            }
        });

    }
}
