package Loop;

import java.util.Scanner;

public class LoopNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Escreva	um	programa	para	ler	as	notas	da	1ª	e	2ª	avaliações	de	um	aluno,
		 * 	calcular	e	imprimir	a	média	semestral.	
		 *  Faça	com	que	o	algoritmo	só	aceite	 notas	válidas	(uma	nota	válida	deve	pertencer	ao	intervalo	[0,10]).
		 * 	Cada	 nota	deve	ser	validada	separadamente.	Deve	ser	impressa	a	mensagem	 "Nota	inválida"
		 * 	caso	a	nota	informada	não	pertença	ao	intervalo	[0,10]. 
		 */

		double n1, n2, mSemestral;
		
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextInt();
		
		while(n1 < 0 || n1 > 10) {
			System.out.println("Nota invalida, digite uma nota no intervalo de 0 a 10.");
			System.out.print("Digite novamente a primeira nota: ");
			n1 = entrada.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextInt();
		
		while(n2 < 0 || n2 > 10) {
			System.out.println("Nota invalida, digite uma nota no intervalo de 0 a 10.");
			System.out.print("Digite novamente a segunda nota: ");
			n2 = entrada.nextDouble();
		}
		
		mSemestral = (n1+n2)/2;
		
		System.out.printf("A média semestral é: %.2f%n",mSemestral);
	}

}
