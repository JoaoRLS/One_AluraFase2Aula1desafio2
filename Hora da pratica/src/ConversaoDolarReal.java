public class ConversaoDolarReal {
    public static void main(String[] args) {
        double real = 100;
        double valorDolar = 4.94;
        double valorEmDolares = real / valorDolar;/**Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.*/
        System.out.printf("Valor em dólar: $%.2f%n" , valorEmDolares);
        //Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        System.out.printf("Valor em Reais: R$%.2f%n", real);
        System.out.printf("$%.2f dolares equivale a R$%.2f%n", valorEmDolares, real);
        System.out.printf("Valor de 1 dolar: R$%.2f%n", valorDolar);

    }
}
