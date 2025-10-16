package Aulaa;

import java.util.Scanner;

public class Exercicio1_Lista2 {
    
    /* Implemente em java um Array que leia 5 notas de uma turma, exiba as 5 notas 
    digitadas, calcula e exibe a média das notas */ 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[] notas=new double[5];
        String[] nomes={"Adriano", "Otavio", "Ryan", "Bianca", "Isabel"};
        int i;
        double soma=0;

        // ler as notas
        for(i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.printf("Digite a nota de %s (0 a 10): ", nomes[i]);
                nota = entrada.nextDouble();
                if(nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while(nota < 0 || nota > 10);
            notas[i] = nota;
        }
        
        // imprimir o vetor de notas
        for(i=0; i<notas.length; i++) {
            System.out.printf("%s: %.2f\n",nomes[i], notas[i]);
        }

        // calcular a média
        for(i=0; i<notas.length; i++) {
            soma += notas[i];
        }
        double media=soma/notas.length;
        System.out.printf("\nMédia dos alunos: %.2f\n",media);

        // imprimir a maior e a menor nota
        double maior=notas[0];
        double menor=notas[0];
        int indiceMaior=0;
        int indiceMenor=0;

        for(i=1; i<notas.length; i++) {
            if(notas[i]>maior) {
                maior=notas[i];
                indiceMaior=i;
            }
            if(notas[i]<menor) {
                menor=notas[i];
                indiceMenor=i;
            }
        }

        System.out.printf("Maior nota: %.2f (%s)\n",maior,nomes[indiceMaior]);
        System.out.printf("Menor nota: %.2f (%s)\n",menor,nomes[indiceMenor]);
    }
}
