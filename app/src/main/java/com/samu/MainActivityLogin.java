package com.samu;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.samu.Dao.Cadastro;
import com.samu.dados.UsuarioApp;

public class MainActivityLogin extends AppCompatActivity {
    Cadastro dao = new Cadastro();
    UsuarioApp usuario;
    private EditText edtEmail;
    private EditText edtSenha;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

            public void login(View v) {


                TextView Email=(EditText) findViewById(R.id.edtEmail);
                TextView Senha = (EditText) findViewById(R.id.edtSenha);
                String email = Email.getText().toString();
                String senha = Senha.getText().toString();



                if(email.equals("jonas") && senha.equals("1234") ){
                    Toast.makeText(MainActivityLogin.this,"Usuário logado: " + email,Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivityLogin.this, MainActivitySegundaTela.class));
                }else
                    Toast.makeText(MainActivityLogin.this,"Email ou Senha invalido! ",Toast.LENGTH_SHORT).show();
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
