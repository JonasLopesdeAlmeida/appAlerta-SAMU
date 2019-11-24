package com.samu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.samu.Dao.Cadastro;
import com.samu.Dao.CadastroAlertas;

public class ListaDeAlertas extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lisradealertas);

        Button btnListaAlerta = findViewById(R.id.btnListaAlerta);
        btnListaAlerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ListaDeAlertas.this, MainActivitySegundaTela.class));

            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();

        ListView lista = findViewById(R.id.edtListaDeAlertas);

        CadastroAlertas dao = new CadastroAlertas();

        lista.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }

}
