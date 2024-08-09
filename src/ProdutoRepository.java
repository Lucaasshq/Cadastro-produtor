import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProdutoRepository {

    private Set<Produto> produtoSet;

    public ProdutoRepository() {
        this.produtoSet = new HashSet<Produto>();
    }

    public void adicionarProduto(long codigo ,String nome , double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosNome() {
        Set<Produto> produtorPorNome = new TreeSet<>(produtoSet);
        return produtorPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new CompararPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;

    }
}
