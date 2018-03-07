 package com.carlossanchez.dulceapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.carlossanchez.dulceapps.dulcepack.Dulce1Activity;
import com.carlossanchez.dulceapps.dulcepack.Dulce2Activity;
import com.carlossanchez.dulceapps.dulcepack.Dulce3Activity;
import com.carlossanchez.dulceapps.dulcepack.Dulce4Activity;

 public class DulcePrintActivity extends AppCompatActivity {


    Button dulce1,dulce2,dulce3,dulce4,dulce5,dulce6,dulce7,dulce8,dulce9,dulce10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulce_print);

        dulce1 = findViewById(R.id.dulce1);
        dulce2 = findViewById(R.id.dulce2);
        dulce3 = findViewById(R.id.dulce3);
        dulce4 = findViewById(R.id.dulce4);


        dulce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent A = new Intent(DulcePrintActivity.this,Dulce1Activity.class);
                startActivity(A);
            }
        });


        dulce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent C = new Intent(DulcePrintActivity.this,Dulce2Activity.class);
                startActivity(C);
            }
        });

        dulce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent E = new Intent(DulcePrintActivity.this, Dulce3Activity.class);
                startActivity(E);
            }
        });

        dulce4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent H = new Intent(DulcePrintActivity.this, Dulce4Activity.class);
                startActivity(H);
            }
        });










    }
}
