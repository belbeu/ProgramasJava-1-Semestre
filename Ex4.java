package Exercicios;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores você deseja digitar? ");
        int n = scanner.nextInt();

        int[] valores = new int[n];

        System.out.println("Digite os valores inteiros:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
        }

        System.out.println("Valores na ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
    }
}
