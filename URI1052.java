import java.util.Scanner;

public class URI1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int mes;
        String nome_mes;

        //entrada
        System.out.println("Informe mes:");
        mes = teclado.nextInt();

        //processamento
        if (mes == 1){
            nome_mes = "January";
        }
        else if (mes == 2){
            nome_mes = "February";
        }
        else if (mes == 3){
            nome_mes = "March";
        }
        else if (mes == 4){
            nome_mes = "April";
        }
        else if (mes == 5){
            nome_mes = "May";
        }
        else if (mes == 6){
            nome_mes = "June";
        }
        else if (mes == 7){
            nome_mes = "July";
        }
        else if (mes == 8){
            nome_mes = "August";
        }
        else if (mes == 9){
            nome_mes = "September";
        }
        else if (mes == 10){
            nome_mes = "October";
        }
        else if (mes == 11){
            nome_mes = "November";
        }
        else if (mes == 12){
            nome_mes = "December";
        }

        //saida
        System.out.println(nome_mes);
    }
}