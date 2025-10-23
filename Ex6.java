package Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanho = 5;
        int[] conjunto1 = new int[tamanho];
        int[] conjunto2 = new int[tamanho];

        System.out.println("Digite os números do primeiro conjunto:");
        for (int i = 0; i < tamanho; i++) {
            conjunto1[i] = entrada.nextInt();
        }

        System.out.println("Digite os números do segundo conjunto:");
        for (int i = 0; i < tamanho; i++) {
            conjunto2[i] = entrada.nextInt();
        }

        System.out.println("Números repetidos nos dois conjuntos:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (conjunto1[i] == conjunto2[j]) {
                    System.out.println(conjunto1[i]);
                    break;
                }
            }
        }
    }
}

