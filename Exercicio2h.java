import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double volume, raio, altura;
        double PI = 3.14;

        //entrada
        System.out.println("Por favor digite o raio e a altura do cilindro");
        raio = teclado.nextDouble();
        altura = teclado.nextDouble();
        

        //processamento
        volume = PI * raio * raio * altura;

        //saida
        System.out.printf("O volume do cilindro vale: %.2f\n", volume);
    }
}