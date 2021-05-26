import java.util.Scanner;

public class URI1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, media;

        //entrada
        System.out.println("Informe as notas:");
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        

        //processamento
        media = ((A * 3.5) + (B * 7.5))/11;

        //saida
        System.out.printf("MEDIA = %.5f\n", media);
    }
}