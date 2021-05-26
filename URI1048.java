import java.util.Scanner;

public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, novo_salario=0, reajuste=0;
        String indice = "";

        //entrada
        System.out.println("Informe o salario do funcionario:");
        salario = teclado.nextDouble();

        //processamento
        if ((salario > 0)&&(salario <= 400.00)){
            novo_salario = salario * 1.15;
            indice = "15%";
            reajuste = novo_salario - salario;
        }
        else if((salario > 400.00)&&(salario <= 800.00)){
            novo_salario = salario * 1.12;
            indice = "12%";
            reajuste = novo_salario - salario;
        }
        else if((salario > 800.00)&&(salario <= 1200.00)){
            novo_salario = salario * 1.10;
            indice = "10%";
            reajuste = novo_salario - salario;
        }
        else if ((salario > 1200.00) && (salario <= 2000.00)){
            novo_salario = salario * 1.07;
            indice = "7%";
            reajuste = novo_salario - salario;
        }
        else if (salario > 2000.00){
            novo_salario = salario * 1.04;
            indice = "4%";
            reajuste = novo_salario - salario;
        }

        //saida
        System.out.printf("Novo salario: %.2f\n", novo_salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + indice);

    }
}