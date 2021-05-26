import java.util.Scanner;

public class URI1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidade;
        double litros, distancia;

        //entrada
        System.out.println("Informe distancia percorrida e qtd de combustivel:");
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        //processamento
        distancia = velocidade * tempo;
        litros = distancia / 12;

        //saida
        System.out.printf("%.3f\n", litros);
    }
}