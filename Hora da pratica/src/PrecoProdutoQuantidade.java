/**Declare uma variável do tipo double precoProduto e uma
 * variável do tipo int (quantidade). Calcule o valor total
 * multiplicando o preço do produto pela quantidade e
 * apresente o resultado em uma mensagem.
 * */
public class PrecoProdutoQuantidade {
    public static void main(String[] args) {
        double precoProduto = 10.55;
        int quantidade = 4;
        double valorTotal = precoProduto * quantidade;

        System.out.println("Total a pagar: R$ " + valorTotal);
    }
}
