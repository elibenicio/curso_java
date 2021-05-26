import java.util.Scanner;

public class URI1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        //entrada
        System.out.println("Informe as notas:");
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        

        //processamento
        DIFERENCA = (A * B - C * D);

        //saida
        System.out.println("DIFERENCA = "+ DIFERENCA);
    }
}