package org.example;

import java.util.Scanner;

public class Exer6_LernomeImprimirIniciais {
    public static void main(String[] args) {
        //Ler o nome completo de 4 alunos e mostrar cada nome
        //com suas iniciais.

        Scanner sc = new Scanner(System.in);

        final int TOTAL_ALUNOS = 4;
        String[] nomesCompletos = new String[TOTAL_ALUNOS];

        System.out.println("♠♠♠ Formulario de cadastro de Alunos ♠♠♠");
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            System.out.printf("Digite o nome completo do %dº aluno: ", (i + 1));
            nomesCompletos[i] = sc.nextLine().trim();
        }
        System.out.println("\n♦♦♦ Lista de Alunos e Iniciais ♦♦♦");
        for (int i = 0; i < TOTAL_ALUNOS; i++) {
            String nomeAtual = nomesCompletos[i];

            String[] partesDoNome = nomeAtual.split("\\s+");
            StringBuilder iniciais = new StringBuilder();

            for (String palavra : partesDoNome) {
                String palavraMinuscula = palavra.toLowerCase();

                if (!palavraMinuscula.equals("de") && !palavraMinuscula.equals("da") &&
                        !palavraMinuscula.equals("do") && !palavraMinuscula.equals("dos") &&
                        !palavraMinuscula.equals("e") && !palavra.isEmpty()) {

                    iniciais.append(Character.toUpperCase(palavra.charAt(0))).append(".");
                }
            }
            System.out.printf("%s - %s%n", nomeAtual, iniciais.toString());
        }
        sc.close();
    }
}
