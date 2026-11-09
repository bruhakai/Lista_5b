package org.example;

import java.util.Scanner;

public class Exer5_CONTAR_VOGAL {
    public static void main(String[] args) {
        //Ler 3 palavras ou frases e mostrar quantas vogais cada uma tem, sem
        //diferenciar maiúscula de minúscula

        Scanner sc = new Scanner(System.in);

        final int TFrases = 3;
        String[] textos = new String[TFrases];

        System.out.println("♥♥♥ Entrada de PALAVRAS ou FRASES ♥♥♥");
        for (int i = 0; i < TFrases; i++) {
            System.out.printf("Digite a %d° palavra ou frase: ", (i + 1));
            textos[i] = sc.nextLine();
        }
        System.out.println("\n☺☺☺ Resultado da contagem de VOGAIS ☺☺☺");
        for (int i = 0; i < TFrases; i++) {
            int contVogais = 0;

            String textoMinusculo = textos[i].toLowerCase();

            for (int j = 0; j < textoMinusculo.length(); j++) {
                char caractere = textoMinusculo.charAt(j);

                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    contVogais++;
                }
            }
            System.out.printf("\"%s\" -> possui %d vogal(is)%n", textos[i], contVogais);
        }
        sc.close();
    }
}
