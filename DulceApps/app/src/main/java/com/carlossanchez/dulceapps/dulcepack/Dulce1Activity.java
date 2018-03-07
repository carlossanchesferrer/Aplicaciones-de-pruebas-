package com.carlossanchez.dulceapps.dulcepack;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.carlossanchez.dulceapps.DulcePrintActivity;
import com.carlossanchez.dulceapps.R;

public class Dulce1Activity extends AppCompatActivity {

    ImageButton dulce01;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulce1);



        dulce01 = findViewById(R.id.btn1);

        dulce01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B =new Intent(Dulce1Activity.this,DulcePrintActivity.class);
                startActivity(B);

            }
        });


    }
}
