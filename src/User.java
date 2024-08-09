public class User {
    public static void main(String[] args) {
        ProdutoRepository cadastroProduto = new ProdutoRepository();

        cadastroProduto.adicionarProduto(1L, "Arroz", 6d, 8);
        cadastroProduto.adicionarProduto(2L, "Feijão", 8d, 4);
        cadastroProduto.adicionarProduto(1L, "Carne", 20d, 1);
        cadastroProduto.adicionarProduto(9L, "Frango", 18d, 1);


        System.out.println(cadastroProduto.exibirProdutosNome());

        System.out.println(cadastroProduto.exibirPorPreco());

    }
}
