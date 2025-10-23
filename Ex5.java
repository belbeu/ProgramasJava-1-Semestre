package Exercicios;

public class Ex5 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i=0; i<vetor.length; i++) {
            vetor[i] = 101 + i;
        }

        System.out.println("Valores do vetor:");
        for (int i=0; i<vetor.length; i++) {
            System.out.println("Posição "+i+": "+vetor[i]);
        }
    }
}

