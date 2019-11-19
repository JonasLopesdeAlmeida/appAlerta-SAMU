package com.samu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.samu.Dao.Cadastro;

public class ListaDeCadastro extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listadecadastro);

        Button btnMostrar = findViewById(R.id.btnMostrar);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaDeCadastro.this, MainActivityCriarConta.class));
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();

        ListView lista = findViewById(R.id.edtListaDeCada);

        Cadastro dao = new Cadastro();

        lista.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }


}



