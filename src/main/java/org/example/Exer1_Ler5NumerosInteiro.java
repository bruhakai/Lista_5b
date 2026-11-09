package org.example;

import java.util.Scanner;

public class Exer1_Ler5NumerosInteiro {
    public static void main(String[] args) {
        //Ler 5 números inteiros positivos e mostrar quantos dígitos cada
        //um tem

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("♥♥♥ Entrada de Dados ♥♥♥");

        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.printf("Digite o %d° numero inteiro positivo: ", (i + 1));
                int valor = sc.nextInt();

                if (valor >= 0) {
                    numeros[i] = valor;
                    break;
                }
                System.out.println("Erro! O numero precisa ser positivo (maior ou igual a zero. ");
            }
        }

        System.out.println("\n☻☻☻ Resultado do tamanho dos numeros ☻☻☻");

        for (int i = 0; i < numeros.length; i++) {
            int qtdDigitos = String.valueOf(numeros[i]).length();

            System.out.printf("O numero %d tem %d digitos(s) .%n", numeros[i], qtdDigitos);
        }
    }
}
