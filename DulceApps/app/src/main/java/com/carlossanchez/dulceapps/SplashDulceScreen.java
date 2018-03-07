package com.carlossanchez.dulceapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashDulceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_dulce_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent K = new Intent(SplashDulceScreen.this,DulcePrintActivity.class);
                startActivity(K);

            }
        },2000);
    }
}
