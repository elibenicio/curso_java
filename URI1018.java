import java.util.Scanner;

public class URI1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        int c1, c2, c3, c4, c5, c6, c7;
        int resto;

        //entrada
        System.out.println("Informe o valor:");
        valor = teclado.nextInt();

        //processamento
        c1 = valor / 100;
        resto = valor % 100;
        c2 = resto / 50;
        resto = resto % 50;
        c3 = resto / 20;
        resto = resto % 20;
        c4 = resto / 10;
        resto = resto % 10;
        c5 = resto / 5;
        resto = resto % 5;
        c6 = resto / 2;
        resto = resto % 2;
        c7 = resto;

        //saida
        System.out.println(valor);
        System.out.println(c1 + " nota(s) de R$ 100,00");
        System.out.println(c2 + " nota(s) de R$ 50,00");
        System.out.println(c3 + " nota(s) de R$ 20,00");
        System.out.println(c4 + " nota(s) de R$ 10,00");
        System.out.println(c5 + " nota(s) de R$ 5,00");
        System.out.println(c6 + " nota(s) de R$ 2,00");
        System.out.println(c7 + " nota(s) de R$ 1,00");
    }
}