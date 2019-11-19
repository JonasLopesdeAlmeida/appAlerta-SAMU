package com.samu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Outra(View view) {
    }


    public void TelaDeCadastro(View view){
        Intent intent = new Intent(this, MainActivityCriarConta.class);
        startActivity(intent);
    }

    public void TelaPrincipal(View view) {
        Intent intent = new Intent(this, MainActivitySegundaTela.class);
        startActivity(intent);
    }
}
