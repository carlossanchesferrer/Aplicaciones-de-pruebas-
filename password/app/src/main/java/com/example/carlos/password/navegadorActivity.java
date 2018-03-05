package com.example.carlos.password;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class navegadorActivity extends AppCompatActivity {
    WebView webini;
    Button btnThanks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        btnThanks=findViewById(R.id.btnThanks);

        webini=(WebView) findViewById(R.id.webini);
        webini.loadUrl("http://tecnyplusrpd.blogspot.com/");

        btnThanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent S=new Intent(navegadorActivity.this,MainActivity.class);
                startActivity(S);
            }
        });



            }



                                }



