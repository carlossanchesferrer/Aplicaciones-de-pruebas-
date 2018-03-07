package com.carlossanchez.dulceapps.dulcepack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.carlossanchez.dulceapps.DulcePrintActivity;
import com.carlossanchez.dulceapps.R;

public class Dulce2Activity extends AppCompatActivity {

    ImageButton btn2d2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dulce2);


        btn2d2 = findViewById(R.id.btn2d2);


        btn2d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent D = new Intent(Dulce2Activity.this,DulcePrintActivity.class);
                startActivity(D);
            }
        });
    }
}
