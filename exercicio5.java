import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        double somaMedias = 0;

        for (int aluno = 1; aluno <= 6; aluno++) {

            System.out.println("Digite a primeira nota do aluno " + aluno + ": ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + aluno + ": ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno " + aluno + ": " + media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } 
            else if (media < 7) {
                System.out.println("EXAME");
                exame++;
            } 
            else {
                System.out.println("APROVADO");
                aprovados++;
            }

            somaMedias = somaMedias + media;
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("----------------------");
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de alunos de exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

        entrada.close();
    }
}