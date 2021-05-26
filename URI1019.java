import java.util.Scanner;

public class URI1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, hora, minutos, segundos, resto;

        //entrada
        System.out.println("Informe o tempo em segundos:");
        tempo = teclado.nextInt();
        
        //processamento
        minutos = tempo / 60;
        segundos = tempo % 60;
        hora = minutos / 60;
        minutos = minutos % 60;

        //saida
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}