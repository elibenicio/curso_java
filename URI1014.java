import java.util.Scanner;

public class URI1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        double Y, consumo;

        //entrada
        System.out.println("Informe distancia percorrida e qtd de combustivel:");
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        //processamento
        consumo = X / Y;

        //saida
        System.out.printf("%.3f km/l\n", consumo);
    }
}