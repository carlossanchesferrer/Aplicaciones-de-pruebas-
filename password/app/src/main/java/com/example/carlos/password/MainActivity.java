package com.example.carlos.password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvRegistrese;
    WebView webini;
    Button btnIngresar;
    Button btnInternet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvRegistrese=(TextView)findViewById(R.id.tvRegistrese);
        webini=findViewById(R.id.webini);
        btnIngresar=findViewById(R.id.btnIngresar);
        btnInternet=findViewById(R.id.btnInternet);

        tvRegistrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),registro.class);
                startActivity(i);
            }
        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent O=new Intent(MainActivity.this,ArticulosActivity.class);
                startActivity(O);
            }
        });



        btnInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent U=new Intent(MainActivity.this,navegadorActivity.class);
                startActivity(U);
            }
        });
    }
}
