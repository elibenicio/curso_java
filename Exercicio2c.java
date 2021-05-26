import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        //entrada
        System.out.println("Por favor digite o valor da base do triangulo");
        base = teclado.nextDouble();

        //entrada
        System.out.println("Por favor digite o valor da altura do triangulo");
        altura = teclado.nextDouble();
        
        //processamento
        area = base * altura;

        //saida
        System.out.println("A area do triangulo de base " + base + " e altura " + altura + " vale: " + area);
    }
}