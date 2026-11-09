package org.example;

import java.util.Scanner;

public class Exerc10_TorreHanoi {
    // Variável global para contar os movimentos gerados em cada jogo
    private static int contadorMovimentos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_JOGOS = 3;

        int[] discosPorJogo = new int[TOTAL_JOGOS];


        System.out.println("--- Configuração da Torre de Hanói ---");
        for (int i = 0; i < TOTAL_JOGOS; i++) {
            while (true) {
                System.out.printf("Digite a quantidade de discos do Jogo %d (mínimo 1): ", (i + 1));
                discosPorJogo[i] = scanner.nextInt();
                if (discosPorJogo[i] >= 1) {
                    break;
                }
                System.out.println("Quantidade inválida! O jogo precisa de pelo menos 1 disco.");
            }
        }


        for (int i = 0; i < TOTAL_JOGOS; i++) {
            int qteDiscos = discosPorJogo[i];
            contadorMovimentos = 0;
            System.out.println("\n=========================================");
            System.out.printf("      SIMULAÇÃO DO JOGO %d (%d DISCOS)      %n", (i + 1), qteDiscos);
            System.out.println("=========================================");


            resolverHanoi(qteDiscos, 'A', 'C', 'B');


            System.out.println("-----------------------------------------");
            System.out.printf("Total de movimentos realizados no Jogo %d: %d%n", (i + 1), contadorMovimentos);
        }

        scanner.close();
    }



    public static void resolverHanoi(int n, char orig, char dest, char aux) {

        if (n == 1) {
            System.out.printf("Mover disco 1 do Pino %c para o Pino %c%n", orig, dest);
            contadorMovimentos++;
            return;
        }

        resolverHanoi(n - 1, orig, aux, dest);


        System.out.printf("Mover disco %d do Pino %c para o Pino %c%n", n, orig, dest);
        contadorMovimentos++;


        resolverHanoi(n - 1, aux, dest, orig);
    }
}