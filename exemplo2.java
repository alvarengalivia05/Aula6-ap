
import java.util.Scanner;


public class exemplo2 {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);

        int idade,acumuladorIdades=0; //acumulador
        int cont; // declara contador

        for (cont=0; cont<5;cont++){
            System.err.println("digite a sua idade"); idade=
            entrada.nextInt();
            acumuladorIdades+=idade;
        }

        System.err.println("A soma das idades é "+ acumuladorIdades);
        entrada.close();
    }
}