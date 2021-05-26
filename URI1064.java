import java.util.Scanner;

public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double media=0, valor, soma=0;
        int qtd=0;
        
        for (int i=1; i<=6; i++){
            valor = teclado.nextDouble();
            if (valor > 0){
                soma = soma + valor;
                qtd = qtd + 1;
            }
        }
        media = soma/qtd;
        System.out.println(qtd + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
