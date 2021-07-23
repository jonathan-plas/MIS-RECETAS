package com.example.misrecetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


    }

    //Metodo para ocultar o mostrar el menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.integrantes){

            Intent intent = new Intent(this,Integrantes.class);
            startActivity(intent);
            finish();

        }else if (id == R.id.salir){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void detalle(View view){
        Intent intent = new Intent(this,Detalle_receta.class);
        startActivity(intent);
        finish();
    }
}