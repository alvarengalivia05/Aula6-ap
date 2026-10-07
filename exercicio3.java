import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        for (int cont = 1; cont <= numero; cont++)
         {
            System.out.println(cont);
        }

        entrada.close();
    }
}
