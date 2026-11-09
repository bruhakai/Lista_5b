package org.example;

import java.util.Scanner;

public class Exer7_LerFrasePalindromo {
    public static void main(String[] args) {
        //Ler 3 frases e dizer se cada uma é palíndromo, ou seja, se é igual lida de
        //trás para frente, ignorando espaços e maiúsculas.

        Scanner sc = new Scanner(System.in);

        final int TOTAL_FRASES = 3;

        String[] frases = new String[TOTAL_FRASES];


        System.out.println("♥♥♥ Verificador de Palíndromos ♥♥♥");
        for (int i = 0; i < TOTAL_FRASES; i++) {
            System.out.printf("Digite a %dª frase: ", (i + 1));
            frases[i] = sc.nextLine();
        }


        System.out.println("\n♦♦♦ Resultado da Análise ♦♦♦");
        for (int i = 0; i < TOTAL_FRASES; i++) {
            String fraseOriginal = frases[i];


            String fraseLimpa = fraseOriginal.replace(" ", "").toLowerCase();


            String fraseInvertida = new StringBuilder(fraseLimpa).reverse().toString();

            // Compara se o texto limpo é igual ao texto invertido
            if (fraseLimpa.equals(fraseInvertida)) {
                System.out.printf("\"%s\" -> É um palíndromo!%n", fraseOriginal);
            } else {
                System.out.printf("\"%s\" -> Não é um palíndromo.%n", fraseOriginal);

            }
        }
        System.out.println("♥♥♥ Boas festa de fim de ano e um excelente 2027 pra ti ♥♥♥");

        sc.close();
    }
}

