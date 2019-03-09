package com.kinitoapps.bloodhub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash_screen);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        int SPLASH_DISPLAY_LENGTH = 1000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                /* Create an Intent that will start the Menu-Activity. */


                    Intent mainIntent = new Intent(SplashScreen.this,DonorOrSeeker.class);
                    SplashScreen.this.startActivity(mainIntent);
                    SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }


}


