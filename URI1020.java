import java.util.Scanner;

public class URI1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade, anos, meses, dias;

        //entrada
        System.out.println("Informe a idade em dias:");
        idade = teclado.nextInt();
        
        //processamento
        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = (idade % 365) % 30;

        //saida
        System.out.print(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)\n");
    }
}