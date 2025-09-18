package aulaSla;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		//ler vários números reais, finalizar a digitação com 0
		//e contar e imprimir quantos números foram digitados
		//dps calcular e imprimir a média
		
		double num, media;
		double soma = 0;
		int  qtd = 0;
		
		System.out.println("Digite vários números reais (para finalizar digite 0): ");
		do {		
			num = entrada.nextDouble();
			//soma = soma+num;
			soma+=num;
			qtd ++;
		}while (num != 0);
		qtd = qtd - 1;
		media = soma/qtd;
		System.out.print("Quantidade de números digitados: "+qtd);
		System.out.print("\nSoma dos números digitados: "+soma);
		System.out.printf("\nMédia dos números digitados: %.2f",media);
	}

}
