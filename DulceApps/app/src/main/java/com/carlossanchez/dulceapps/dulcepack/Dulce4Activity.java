package com.carlossanchez.dulceapps.dulcepack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.carlossanchez.dulceapps.DulcePrintActivity;
import com.carlossanchez.dulceapps.R;

public class Dulce4Activity extends AppCompatActivity {

    ImageButton btnchess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulce4);


        btnchess = findViewById(R.id.btnchess);

        btnchess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent G = new Intent(Dulce4Activity.this, DulcePrintActivity.class);
                startActivity(G);
            }
        });

    }
}
