import java.util.Scanner;

public class URI1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, par=0;
        
        X = teclado.nextInt();
        par = X % 2;
        if (par == 0){
            X++;
            System.out.println(X);
        }
        else {
            System.out.println(X);
        }
        for (int i=1; i<=6; i++){
            System.out.println(X+=2);
        }
    }
}
