package com.samu.Dao;

import com.samu.dados.UsuarioApp;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private final static List<UsuarioApp> usuarios = new ArrayList<>();

    public void salvar(UsuarioApp usuario) {
        usuarios.add(usuario);
    }

    //Cópia da lista estatica
    public List<UsuarioApp> todos(){
        return new ArrayList<>(usuarios);
    }
}
