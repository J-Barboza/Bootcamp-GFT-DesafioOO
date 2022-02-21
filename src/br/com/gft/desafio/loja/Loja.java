package br.com.gft.desafio.loja;

import br.com.gft.desafio.produto.Produto;
import br.com.gft.desafio.Vendedor.Vendedor;

import java.time.LocalDate;

public class Loja extends Vendedor {

    private LocalDate dataVenda = LocalDate.now();

    public void vender(Produto produto, int quantidade, Vendedor vendedor){
        if (produto.getEstoque() >= quantidade){
            produto.setEstoque(produto.getEstoque()-quantidade);
            vendedor.setData(dataVenda);
            vendedor.setComissao((produto.getPreco()*quantidade)*COMISSAO);
        } else {
            System.err.println("Quantidade insuficiente para venda do produto " + produto.getDescricao());
        }
    }

    public void comprar(Produto produto, int quantidade, double preco){
        double custoMedio = ((produto.getEstoque() * produto.getPrecoMedio()) + (quantidade * preco)) / (produto.getEstoque() + quantidade);
        produto.setPrecoMedio(custoMedio);
        produto.setEstoque(produto.getEstoque()+quantidade);
        produto.setPreco(preco);
    }

}
