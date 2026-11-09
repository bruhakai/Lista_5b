package org.example;

import java.util.Scanner;

public class Exer9_Fibonacci {
    public static void main(String[] args) {
        //Ler N de 1 a 30 e mostrar os N primeiros termos da sequência de
        //Fibonacci e a soma deles.

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.println("♦♦♦ Sequência de Fibonacci com Vetor ♦♦♦");
        while (true) {
            System.out.print("Quantos termos deseja ver (de 1 a 30)? ");
            n = scanner.nextInt();

            if (n >= 1 && n <= 30) {
                break;
            }
            System.out.println("Quantidade inválida! Por favor meu camarada, escolha um número de 1 a 30.");
        }

        int[] fibonacci = new int[n];
        int soma = 0;


        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            soma += fibonacci[i];
        }


        System.out.println("\n♥♥♥ Resultados ♥♥♥");
        System.out.printf("Os %d primeiros termos são: ", n);
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i]);
            if (i < n - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
        System.out.printf("A soma de todos esses termos é: %d%n", soma);

    }
}
