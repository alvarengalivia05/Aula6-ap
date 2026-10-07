import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double somaAlturas = 0;
        int quantidade = 0;

        for (int cont = 1; cont <= 10; cont++) {

            System.out.println("Digite a idade da pessoa " + cont + ": ");
            int idade = entrada.nextInt();

            System.out.println("Digite a altura da pessoa " + cont + ": ");
            double altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas = somaAlturas + altura;
                quantidade++;
            }
        }

        if (quantidade > 0) {
            double media = somaAlturas / quantidade;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa tem mais de 50 anos.");
        }

        entrada.close();
    }
}