import java.util.Scanner;

public class URI1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        double total = 0;

        double p1 = 4.00;
        double p2 = 4.50;
        double p3 = 5.00;
        double p4 = 2.00;
        double p5 = 1.50;

        //entrada
        System.out.println("Informe o codigo e a quantidade desejada:");
        cod = teclado.nextInt();
        qtde = teclado.nextInt();

        //processamento
        if (cod == 1){
            total = qtde * p1;
        }
        else if (cod == 2){
            total = qtde * p2;
        }
        else if (cod == 3){
            total = qtde * p3;
        }
        else if (cod == 4){
            total = qtde * p4;
        }
        else if (cod == 5){
            total = qtde * p5;
        }

        //saida
        System.out.printf("Total: R$ %.2f\n", total);
    }
}