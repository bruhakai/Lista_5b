package org.example;

import java.util.Random;

public class Exer8_SorteioNum {
    public static void main(String[] args) {
        //Sortear 6 números de 1 a 60 sem repetir nenhum e mostrar o
        //resultado

        Random random = new Random();

        final int TOTAL_NUMEROS = 6;
        int[] numerosSorteados = new int[TOTAL_NUMEROS];

        int quantidadeSorteada = 0;

        while (quantidadeSorteada < TOTAL_NUMEROS) {
            int numeroCandidato = random.nextInt(60) + 1;
            boolean jaExiste = false;

            for (int i = 0; i < quantidadeSorteada; i++) {
                if (numerosSorteados[i] == numeroCandidato) {
                    jaExiste = true;
                    break;
                }
            }

            if (!jaExiste) {
                numerosSorteados[quantidadeSorteada] = numeroCandidato;
                quantidadeSorteada++;
            }
        }

        System.out.println("$$$ RESULTADO DO SORTEIO (6 números de 1 a 60) $$$");
        System.out.print("Números sorteados: ");
        for (int i = 0; i < TOTAL_NUMEROS; i++) {
            System.out.print(numerosSorteados[i]);
            if (i < TOTAL_NUMEROS - 1) {
                System.out.print(" - ");

            }
        }
        System.out.println();
        System.out.println("$$$ Parabens, vc esta MILHIONARIO agora $$$");
    }
}
