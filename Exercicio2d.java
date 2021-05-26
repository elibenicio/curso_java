import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double diag1, diag2, area;

        //entrada
        System.out.println("Por favor digite o valor da diagonal 1 do losango");
        diag1 = teclado.nextDouble();

        //entrada
        System.out.println("Por favor digite o valor da diagonal 2 do losango");
        diag2 = teclado.nextDouble();
        
        //processamento
        area = diag1 * diag2;

        //saida
        System.out.println("A area do losango de diagonal 1 " + diag1 + " e diagonal 2 " + diag2 + " vale: " + area);
    }
}