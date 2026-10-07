import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int nulos = 0;
        int brancos = 0;

        for (int eleitor = 1; eleitor <= 10; eleitor++) {

            System.out.println("Digite o voto do eleitor " + eleitor + ": ");
            int voto = entrada.nextInt();

            if (voto == 1) {
                candidato1++;
            } 
            else if (voto == 2) {
                candidato2++;
            } 
            else if (voto == 3) {
                candidato3++;
            } 
            else if (voto == 4) {
                candidato4++;
            } 
            else if (voto == 5) {
                nulos++;
            } 
            else if (voto == 6) {
                brancos++;
            } 
            else {
                System.out.println("Voto inválido!");
            }
        }

        int totalVotos = candidato1 + candidato2 + candidato3 + candidato4 + nulos + brancos;

        double percentualBrancos = (brancos * 100.0) / totalVotos;
        double percentualNulos = (nulos * 100.0) / totalVotos;

        System.out.println("----------------------");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);
        System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

        entrada.close();
    }
}