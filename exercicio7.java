import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int maiores50 = 0;
        int quantidade10a20 = 0;
        double somaAlturas = 0;
        int pesoMenor40 = 0;

        for (int pessoa = 1; pessoa <= 10; pessoa++) {

            System.out.println("Digite a idade da pessoa " + pessoa + ": ");
            int idade = entrada.nextInt();

            System.out.println("Digite a altura da pessoa " + pessoa + ": ");
            double altura = entrada.nextDouble();

            System.out.println("Digite o peso da pessoa " + pessoa + ": ");
            double peso = entrada.nextDouble();

            // a) Pessoas maiores de 50 anos
            if (idade > 50) {
                maiores50++;
            }

            // b) Média das alturas entre 10 e 20 anos
            if (idade >= 10 && idade <= 20) {
                somaAlturas = somaAlturas + altura;
                quantidade10a20++;
            }

            // c) Pessoas com peso inferior a 40 kg
            if (peso < 40) {
                pesoMenor40++;
            }
        }

        double mediaAlturas = somaAlturas / quantidade10a20;
        double porcentagemPeso = (pesoMenor40 * 100.0) / 10;

        System.out.println("----------------------");
        System.out.println("Pessoas maiores de 50 anos: " + maiores50);
        System.out.println("Média das alturas entre 10 e 20 anos: " + mediaAlturas);
        System.out.println("Porcentagem com peso inferior a 40 kg: " + porcentagemPeso + "%");

        entrada.close();
    }
}