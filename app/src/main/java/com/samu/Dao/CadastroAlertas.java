package com.samu.Dao;

import com.samu.dados.Alertas;
import com.samu.dados.UsuarioApp;

import java.util.ArrayList;
import java.util.List;

public class CadastroAlertas {

    private final static List<Alertas> alertas = new ArrayList<>();

    public void salvar(Alertas alerta) {
        alertas.add(alerta);
    }

    //Cópia da lista estatica
    public List<Alertas> todos(){
        return new ArrayList<>(alertas);
    }
}
