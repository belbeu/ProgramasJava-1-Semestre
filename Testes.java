package Loop;

import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		/* ler um int n, for de 2 até n
		se resto da div n por 1==0
		imprimo o divisor
		*/

	        System.out.print("Digite um número: ");
	        int n = entrada.nextInt();

	        System.out.println("Divisores de " + n + " entre 2 e " + n + ":");
	        for (int i = 2; i <= n; i++) {
	            if (n % i == 0) {
	                System.out.println(i);
	            }
	        }
		}
	}

