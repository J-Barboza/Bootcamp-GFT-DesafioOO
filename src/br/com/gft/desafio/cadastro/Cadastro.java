package br.com.gft.desafio.cadastro;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public abstract class Cadastro {

    protected static final double COMISSAO = 0.1d;

    private int codigo;
    private String descricao;


}
