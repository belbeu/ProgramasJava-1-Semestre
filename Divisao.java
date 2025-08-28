package geral;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n = 7;
		double num = 7;
		
		System.out.printf("Divisão de inteiros %d", n/2);
		System.out.printf("\n Resto da Divisão de inteiros %d", n%2);
		System.out.printf("\n Divisão de reais %.2f", num/2);
	}

}
