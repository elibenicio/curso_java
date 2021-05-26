import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base_maior, base_menor, altura, area;

        //entrada
        System.out.println("Por favor digite o valor da base maior do trapezio");
        base_maior = teclado.nextDouble();

        //entrada
        System.out.println("Por favor digite o valor da base menor do trapezio");
        base_menor = teclado.nextDouble();
        
        //entrada
        System.out.println("Por favor digite o valor da altura do trapezio");
        altura = teclado.nextDouble();

        //processamento
        area = (base_maior + base_menor) * altura/2;

        //saida
        System.out.println("A area do trapezio vale: " + area);
    }
}