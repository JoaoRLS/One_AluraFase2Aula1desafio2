/**Declare uma variável do tipo double precoOriginal. Atribua um
 * valor em reais a essa variável, representando o preço original
 * de um produto. Em seguida, declare uma variável do tipo double
 * percentualDesconto e atribua um valor percentual de desconto ao
 * produto (por exemplo, 10 para 10%). Calcule o valor do desconto
 * em reais, aplique-o ao preço original e imprima o novo preço com
 * desconto.*/
public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 120.99;
        double percentualDesconto = 10;
        double desconto = (precoOriginal * percentualDesconto - precoOriginal)/10;

        System.out.printf("Preço sem desconto R$%.2f%n", precoOriginal);
        System.out.printf("Preço R$%.2f com desconto de %.0f%% ", desconto, percentualDesconto);
    }
}
