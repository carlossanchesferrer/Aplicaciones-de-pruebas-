package com.carlossanchez.dulceapps.dulcepack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.carlossanchez.dulceapps.DulcePrintActivity;
import com.carlossanchez.dulceapps.R;

public class Dulce3Activity extends AppCompatActivity {

    ImageButton btnmango;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulce3);



        btnmango = findViewById(R.id.btnmango);

        btnmango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent F = new Intent(Dulce3Activity.this, DulcePrintActivity.class);
                startActivity(F);
            }
        });
    }
}
