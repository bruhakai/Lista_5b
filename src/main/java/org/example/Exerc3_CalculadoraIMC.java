package org.example;

import java.util.Scanner;

public class Exerc3_CalculadoraIMC {
    public static void main(String[] args) {
        // Ler o peso e a altura de 4 pessoas e mostrar o IMC

        Scanner sc = new Scanner(System.in);

        final int TP = 4;

        double[] pesos = new double[TP];
        double[] alturas = new double[TP];
        double[] imc = new double[TP];

        System.out.println("♥♥♥ Cadastro de PESO e ALTURA ♥♥♥ ");
        for (int i = 0; i < TP; i++) {
            System.out.printf("%nDados da %d° Pessoa:%n", (i + 1));

            System.out.println("Digite o pesos em kg(ex: 95,3: ");
            pesos[i] = sc.nextDouble();

            System.out.println("Digite a alturas em metro/cm(ex: 1,83: ");
            alturas[i] = sc.nextDouble();

            imc[i] = pesos[i] / (alturas[i] * alturas[i]);
        }
        System.out.println("\n--- RELATÓRIO GERAL DE IMC ---");
        System.out.printf("%-10s | %-8s | %-8s | %-6s | %-15s%n", "Pessoa", "Peso", "Altura", "IMC", "Classificação");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < TP; i++) {
            String classificacao;

            if (imc[i] < 18.5) {
                classificacao = "Abaixo do peso";

            }  else if (imc[i] < 25.0) {
            classificacao = "Peso Normal";

            } else if (imc[i] < 30.0) {
                classificacao = "Acima do peso";

            } else {
                classificacao = "Obesidade";
            }
            System.out.printf("Pessoa %d   | %-5.1f kg | %-5.2f m  | %-4.1f | %-15s%n",
                    (i + 1), pesos[i], alturas[i], imc[i], classificacao);
        }
        System.out.println("--------------------------------------------------------------------");
        sc.close();
    }
}
