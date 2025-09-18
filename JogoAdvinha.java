package aulaSla;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		
		int sorteado, chute, tentativas, max;
		max = 100;
		tentativas = 0;
		//sortear o número
		sorteado = gerador.nextInt(max) + 1;
		
		System.out.println("Faça seu chute!!!!");
		
		 do {
			System.out.print("\nDigite um número de 1 a " + max +":");			
			chute = entrada.nextInt();
			tentativas ++;
			
			if(chute != sorteado) {
				switch(tentativas) {
				case 1: System.out.println("Que pena, não dessa vez");
					break;
				case 2:  System.out.println("Talvez na próxima?");
					break;
				case 3:  System.out.println("Ta complicado!");
				break;
					default: System.out.println("Cansei de te ajudar");
				}
			
			}else {
				System.out.println("\nINCRÍVEL!!");
			}
			
			if(chute > sorteado) {
				System.out.print("O número sorteado é menor!");				
			} 
			else if (chute < sorteado) {
				System.out.print("O número sorteado é maior!");
				}
			}while(chute != sorteado);
		 
			 System.out.println("\nParabéns! você acertou!");
			 System.out.println("\nNúmero de tentativas: "+tentativas);
	}

}
