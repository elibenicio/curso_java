import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int par, valor, qtd=0;
        
        for (int i=1; i<=5; i++){
            valor = teclado.nextInt();
            par = valor%2;
            if (par == 0){
                qtd = qtd + 1;
            }
        }
            System.out.println(qtd + " valores pares");
        }
    }
