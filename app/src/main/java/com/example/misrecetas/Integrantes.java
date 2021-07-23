package com.example.misrecetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Integrantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);
    }

    public void Regresar (View view){
        Intent intent = new Intent(this,Inicio.class);
        startActivity(intent);
        finish();
    }
}