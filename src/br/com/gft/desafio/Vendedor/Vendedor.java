package br.com.gft.desafio.Vendedor;

import br.com.gft.desafio.cadastro.Cadastro;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter@Setter
public class Vendedor extends Cadastro {

    private String nome;
    private LocalDate data;
    private double comissao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                ", comissao=" + comissao +
                '}';
    }
}
