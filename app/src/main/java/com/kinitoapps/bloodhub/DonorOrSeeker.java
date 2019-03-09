package com.kinitoapps.bloodhub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonorOrSeeker extends AppCompatActivity {
    private Button donor,seeker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_or_seeker);
        donor = findViewById(R.id.donor);
        seeker = findViewById(R.id.seeker);
        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DonorOrSeeker.this,RegisterActivity.class));
            }
        });

        seeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });






    }
}
