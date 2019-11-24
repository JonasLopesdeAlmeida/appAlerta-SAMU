package com.samu.dados;

import java.util.Arrays;

public class Alertas {

    private String observacao;
    //private byte[]foto;

    public Alertas(String observacao) {

        this.observacao = observacao;
       // this.foto = foto;
    }


    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

//    public byte[] getFoto() {
//        return foto;
//    }
//
//    public void setFoto(byte[] foto) {
//        this.foto = foto;
//    }

    @Override
    public String toString() {
        return

                "Observacao = " + observacao + '\'';
    }
}
