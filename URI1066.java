import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor, par=0;
        int qtdpar=0, qtdimpar=0, qtdposi=0, qtdnega=0;
        
        for (int i=1; i<=5; i++){
            valor = teclado.nextInt();
            par = valor%2;
            if (valor > 0){
                qtdposi++;
            }
            if (valor < 0){
                qtdnega++;
            }
            if (par == 0){
                qtdpar++;
            }
            if (par > 0){
                qtdimpar++;
            }
            par=0;
        }
        System.out.println(qtdpar + " valor(es) par(es)");
        System.out.println(qtdimpar + " valor(es) impar(es)");
        System.out.println(qtdposi + " valor(es) positivo(s)");
        System.out.println(qtdnega + " valor(es) negativo(s)");
    }
}
