package com.samu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.samu.Dao.Cadastro;
import com.samu.dados.UsuarioApp;

public class MainActivityCriarConta extends AppCompatActivity {
    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtSexo;
    private EditText edtTelefone;
    private EditText edtCpf;
    private EditText edtsenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criarconta);

    }


    public void cadastrar(View view){

        final Cadastro Dao =  new Cadastro();

        final EditText Nome = findViewById(R.id.edtNome);
        final EditText Email= findViewById(R.id.edtEmail);
        final EditText Sexo= findViewById(R.id.edtSexo);
        final EditText Telefone = findViewById(R.id.edtTelefone);
        final EditText Cpf = findViewById(R.id.edtCPF);
        final EditText Senha= findViewById(R.id.edtsenha);


                String nome = Nome.getText().toString();
                String email = Email.getText().toString();
                String sexo = Sexo.getText().toString();
                String telefone = Telefone.getText().toString();
                String cpf = Cpf.getText().toString();
                String senha = Senha.getText().toString();
                UsuarioApp usuario = new UsuarioApp(nome,email,sexo,telefone,cpf,senha);

                Toast.makeText(MainActivityCriarConta.this,"Nome: "+usuario.getNome()+" Email: "+usuario.getEmail()+" Sexo: "+ usuario.getSexo() + "Telefone: " +usuario.getTelefone() + " Cpf: " + usuario.getCpf() + "Senha: " + usuario.getSenha(),Toast.LENGTH_SHORT).show();


                Dao.salvar(usuario);

                //startActivity(new Intent(CadAtletasActivity.this,ListaAtletasActivity.class));
//                finish();
                Intent intent = new Intent(this, ListaDeCadastro.class);
                startActivity(intent);




            }




    }










