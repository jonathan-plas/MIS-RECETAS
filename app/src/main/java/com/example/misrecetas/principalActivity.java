package com.example.misrecetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class principalActivity extends AppCompatActivity {

    EditText txt_user,txt_password;
    Button btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

       txt_user = (EditText)findViewById(R.id.txt_user);
       txt_password = (EditText)findViewById(R.id.txt_password);
    }

    public void Ingresar(View view){


        String usuario = txt_user.getText().toString();
        String password = txt_password.getText().toString();

        if (usuario.equals("grupo10")&& password.equals("123456")){
            Intent inicio = new Intent(this,Inicio.class);
            startActivity(inicio);
            Toast.makeText(this, "BIENVENIDO" , Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "DATOS INCORRECTOS" , Toast.LENGTH_SHORT).show();
        }
    }
}