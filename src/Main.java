import br.com.gft.desafio.loja.Loja;
import br.com.gft.desafio.produto.Produto;
import br.com.gft.desafio.Vendedor.Vendedor;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setDescricao("Notebook");
        p1.setEstoque(10);
        p1.setPreco(4556.99);
        p1.setPrecoMedio(p1.getPreco());

        System.out.println(p1);

        Loja loja = new Loja();
        Vendedor v1 = new Vendedor();
        v1.setNome("Joao");
        Vendedor v2 = new Vendedor();
        v2.setNome("Pedro");

        loja.vender(p1,3, v1);
        System.out.println(v1);
        System.out.println(p1);
        loja.vender(p1,7,v2);
        System.out.println(p1);
        System.out.println(v2);

        loja.comprar(p1, 1, 4999.99);

        System.out.println(p1);


    }
}
