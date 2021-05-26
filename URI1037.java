import java.util.Scanner;

public class URI1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        Double valor;
        String intervalo = "";

        //entrada
        System.out.println("Informe o salario do funcionario:");
        valor = teclado.nextDouble();

        //processamento
        if ((valor >= 0)&&(valor <= 25.00)){
            intervalo = "Intervalo [0,25]";
        }
        else if((valor > 25.00)&&(valor <= 50.00)){
            intervalo = "Intervalo (25,50]";
        }
        else if((valor > 50.00)&&(valor <= 75.00)){
            intervalo = "Intervalo (50,75]";
        }
        else if ((valor > 75.00) && (valor <= 100.00)){
            intervalo = "Intervalo (75,100]";
        }
        else{
            intervalo = "Fora de intervalo";
        }

        //saida
        System.out.println(intervalo);

    }
}