package com.kinitoapps.bloodhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
   // FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        findViewById(R.id.btnLogOut).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Logout the current user and send him to the register page
//                FirebaseAuth.getInstance().signOut();
//                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
//                finish();
//
//            }
//        });
    }
}
