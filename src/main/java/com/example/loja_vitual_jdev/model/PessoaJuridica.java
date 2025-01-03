package com.example.loja_vitual_jdev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;
    private String nomeFantasia;
    private String razaoSocial;
    private String categoria;

}
