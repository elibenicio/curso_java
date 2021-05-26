import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hr_inicio, hr_fim, duracao = 0;

        //entrada
        System.out.println("Informe hora inicial e final do jogo:");
        hr_inicio = teclado.nextInt();
        hr_fim = teclado.nextInt();

        //processamento
        if (hr_fim > hr_inicio){
            duracao = hr_fim - hr_inicio;
        }
        if (hr_fim < hr_inicio){
            duracao = (24 - hr_inicio) + hr_fim;
        }
        else if(hr_fim == hr_inicio){
            duracao = 24;
        }

        //saida
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}