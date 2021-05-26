import java.util.Scanner;

public class URI1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int func, horas;
        double valor_hora, salario;

        //entrada
        System.out.println("Informe numero do funcionario e horas trabalhadas:");
        func = teclado.nextInt();
        horas = teclado.nextInt();

        System.out.println("Informe o valor por hora:");
        valor_hora = teclado.nextDouble();
        

        //processamento
        salario = horas * valor_hora;

        //saida
        System.out.println("NUMBER = "+ func);
        System.out.println("SALARY = U$ "+ salario);
    }
}