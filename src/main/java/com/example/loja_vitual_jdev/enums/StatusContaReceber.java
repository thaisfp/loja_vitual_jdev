package com.example.loja_vitual_jdev.enums;

import java.io.ObjectInputFilter.Status;

public enum StatusContaReceber {
    
    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada");

    private String descricao;

    private StatusContaReceber(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
