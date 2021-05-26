import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, par=0;
        
        valor = teclado.nextInt();
        for (int i=1; i<=valor; i++){
            par = i%2;
            if (par > 0){
                System.out.println(i);
            }
            par=0;
        }
    }
}
