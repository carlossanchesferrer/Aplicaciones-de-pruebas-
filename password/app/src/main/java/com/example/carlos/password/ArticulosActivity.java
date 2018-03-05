package com.example.carlos.password;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArticulosActivity extends AppCompatActivity {
    Button btnVol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulos);

        btnVol=findViewById(R.id.btnVol);

        btnVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Y=new Intent(ArticulosActivity.this,MainActivity.class);
                startActivity(Y);
            }
        });

    }
}
