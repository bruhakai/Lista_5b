package org.example;

import java.util.Scanner;

public class Exercicio3_NumPRIMOS {
    public static void main(String[] args) {
    //Ler 8 números inteiros e mostrar só os que são primos

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        System.out.println("♣♣♣ ENTRADA DE DADOS ♣♣♣");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d° numero inteiro: ", (i + 1));
            numeros[i] = sc.nextInt();
        }
        System.out.println("\n♠♠♠ Numeros primos ENCONTRADOS ♠♠♠");
        boolean encontrouPrimo = false;

        for (int i = 0; i < numeros.length; i++) {
            if (ehPrimo(numeros[i])) {
                System.out.printf("Posiçao [%d] -> o numero %d é primo.%n", i, numeros[i]);
                encontrouPrimo = true;
            }
        }
        if (!encontrouPrimo) {
            System.out.println("Nenhum numero primo foi encontrado!");
        }
        sc.close();
    }
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
