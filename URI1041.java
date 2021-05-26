import java.util.Scanner;

public class URI1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float x, y;
        String eixo = "";

        //entrada
        System.out.println("Informe as coordenadas x e y:");
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        //processamento
        if ((x == 0.0)&&(y == 0.0)){
            eixo = "Origem";
        }
        else if(((x == 0.0)&&(y > 0.0)) || ((x == 0.0)&&(y < 0.0)) ){
            eixo = "Eixo Y";
        }
        else if(((x < 0.0)&&(y == 0.0)) || ((x > 0.0)&&(y == 0.0))){
            eixo = "Eixo X";
        }
        else if ((x < 0.0) && (y > 0.0)){
            eixo = "Q2";
        }
        else if ((x > 0.0) && (y >0.0)){
            eixo = "Q1";
        }
        else if ((x < 0.0) && (y < 0.0)){
            eixo = "Q3";
        }
        else if ((x > 0.0) && (y < 0.0)){
            eixo = "Q4";
        }

        //saida
        System.out.println(eixo);
    }
}