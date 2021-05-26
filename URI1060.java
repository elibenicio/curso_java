import java.util.Scanner;

public class URI1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double valor;
        int qtd=0;
        
        for (int i=1; i<=6; i++){
            valor = teclado.nextDouble();
            if (valor > 0){
                qtd = qtd + 1;
            }
        }
        System.out.println(qtd + " valores positivos");
    }
}
