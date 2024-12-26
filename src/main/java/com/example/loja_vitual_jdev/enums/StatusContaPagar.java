package com.example.loja_vitual_jdev.enums;

public enum StatusContaPagar {
    
    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    NEGOCIADA("Renegociada");

    private String descricao;

    private StatusContaPagar(String descricao) {
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
