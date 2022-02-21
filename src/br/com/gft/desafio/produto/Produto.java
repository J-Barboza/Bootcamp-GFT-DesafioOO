package br.com.gft.desafio.produto;

import br.com.gft.desafio.cadastro.Cadastro;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto extends Cadastro {

    private int estoque;
    private double preco;
    private double precoMedio;

    @Override
    public String toString() {
        return "Produto{ Codigo: " + getCodigo() +
                " descricao= " + getDescricao() +
                " estoque=" + estoque +
                ", preco=" + preco +
                ", preco medio= " + precoMedio +
                '}';
    }
}
