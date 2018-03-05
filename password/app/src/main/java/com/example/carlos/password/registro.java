package com.example.carlos.password;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import OpenHelper.SQLite_OpenHelper;

public class registro extends AppCompatActivity {

    Button btnRegistrarUsu, btnRegres, btnContin;
    EditText txtNomUSU, txtDisUsu, txtCorUsu, txtPasUsu;

    SQLite_OpenHelper helper = new SQLite_OpenHelper(this, "BD2", null, 1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        btnRegistrarUsu = (Button) findViewById(R.id.btnRegistrarUsu);
        txtNomUSU = (EditText) findViewById(R.id.txtNomUsu);
        txtDisUsu = (EditText) findViewById(R.id.txtDisUsu);
        txtCorUsu = (EditText) findViewById(R.id.txtCorUsu);
        txtPasUsu = (EditText) findViewById(R.id.txtPasUsu);
        btnRegres = findViewById(R.id.btnRegres);
        btnContin = findViewById(R.id.btnContin);

        btnRegistrarUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helper.abrir();
                helper.insertarReg(String.valueOf(txtNomUSU.getText())
                        ,String.valueOf(txtDisUsu.getText()),
                        String.valueOf(txtCorUsu.getText()),
                        String.valueOf(txtPasUsu.getText()));
                helper.cerrar();
                Toast.makeText(getApplicationContext(),"Registrado"
                        ,Toast.LENGTH_LONG).show();

                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
            });

        btnRegres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent P=new Intent(registro.this,MainActivity.class);
                startActivity(P);
            }
        });
        btnContin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B=new Intent(registro.this,MainActivity.class);
                startActivity(B);
            }
        });





    }












    }




