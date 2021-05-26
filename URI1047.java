import java.util.Scanner;

public class URI1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int min_inicio, min_fim, hr_inicio, hr_fim, duracaoh = 0, duracaom = 0;
        int inicio=0, fim=0, duracao=0;

        //entrada
        System.out.println("Informe hora inicial e final do jogo:");
        hr_inicio = teclado.nextInt();
        min_inicio = teclado.nextInt();
        hr_fim = teclado.nextInt();
        min_fim = teclado.nextInt();

        //transforam tudo bem minutos
        inicio = (hr_inicio*60) + min_inicio;
        fim = (hr_fim*60) + min_fim;

        //processamento
        if (fim > inicio){
            duracao = fim - inicio;
            duracaoh = duracao / 60;
            duracaom = duracao % 60;
        }
        else if (fim < inicio){
            duracao = (1440 - inicio) + fim;
            duracaoh = duracao / 60;
            duracaom = duracao % 60;
        }
        else if(fim == inicio){
            duracaom = 0;
            duracaoh = 24;
        }


        //saida
        System.out.println("O JOGO DUROU " + duracaoh + " HORA(S) E " + duracaom + " MINUTO(S)");

    }
}