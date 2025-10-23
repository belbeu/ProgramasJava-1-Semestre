package Exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos números você deseja digitar? ");
        int n = entrada.nextInt();

        int[] numeros = new int[n];

        System.out.println("Digite os números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
