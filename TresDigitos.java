package geral;

import java.util.Scanner;

public class TresDigitos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int u, d, c, quociente, numero, numeroInverso;
		
		System.out.print("Digite um número de 3 casas: ");
		numero = entrada.nextInt();
		
		quociente = numero/10;
		u = numero%10;
		d = quociente%10;
		c = quociente/10;
		
		//System.out.println(u);
		//System.out.println(d);
		//System.out.println(c);
		
		numeroInverso = (u*100)+(d*10)+c;
		System.out.print(numeroInverso);
	}

}
