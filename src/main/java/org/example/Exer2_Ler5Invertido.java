package org.example;

import java.util.Scanner;

public class Exer2_Ler5Invertido {
    public static void main(String[] args) {
        //Ler 5 números inteiros positivos e mostrar cada um com os
        //dígitos invertidos

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int[] invertidos = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número positivo: ");
            numeros[i] = sc.nextInt();

            while (numeros[i] <= 0) {
                System.out.print("Digite um número positivo: ");
                numeros[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            int invertido = 0;

            while (numero > 0) {
                int digito = numero % 10;
                invertido = invertido * 10 + digito;
                numero = numero / 10;
            }

            invertidos[i] = invertido;
        }

        System.out.println("\n♥♥♥ Números originais e invertidos: ♥♥♥");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " -> " + invertidos[i]);
        }
    }
}

