package geral;

import java.util.Scanner;

public class Perfil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int dia, mes, ano, R, div;
		String perfil;
		
		System.out.print("Digite o dia do seu nascimento: ");
		dia = entrada.nextInt();
		
		System.out.print("Digite o mês do seu nascimento: ");
		mes = entrada.nextInt();
		
		System.out.print("Digite o ano do seu nascimento: ");
		ano = entrada.nextInt();
		
		div = dia + mes + ano;
		R = div%5;
		
		switch(R) {
		case 0:
			perfil = "timido";
			break;
		 case 1: 
			perfil = "sonhador";
			break;
		 case 2:
			 perfil = "paquerador";
			 break;
		 case 3:
			 perfil = "atraente";
			 break;
		 case 4:
			 perfil = "irresistível";
			 break;
		default: perfil = "inválido!";
			}	
		System.out.println("Seu perfil é: "+perfil);
		}
	}

