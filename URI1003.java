import java.util.Scanner;

public class URI1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, soma;

        //entrada
        System.out.println("Informe dois valores pra somar:");
        A = teclado.nextInt();
        B = teclado.nextInt();
        

        //processamento
        soma = A + B;

        //saida
        System.out.println("SOMA = " + soma);
    }
}