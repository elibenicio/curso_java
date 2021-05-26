import java.util.Scanner;

public class URI1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double valor1, valor2, valor_total;

        //entrada
        System.out.println("Informe cod, qtde e valor da peca 1:");
        cod1 = teclado.nextInt();
        qtd1 = teclado.nextInt();
        valor1 = teclado.nextDouble();

        System.out.println("Informe cod, qtde e valor da peca 2:");
        cod2 = teclado.nextInt();
        qtd2 = teclado.nextInt();
        valor2 = teclado.nextDouble();
        

        //processamento
        valor_total = (qtd1 * valor1) + (qtd2 * valor2);

        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);
    }
}