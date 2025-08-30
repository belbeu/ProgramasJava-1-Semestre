package Aulas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		double num1, num2, resultado = 0;
		
		//vou utilizar a classe Math do java (Math.pow pra exponenciação e Math.sqrt para radiciação)
		
		System.out.println("CALCULADORA \n"
				+ " 1 - SOMA \n"
				+ " 2 - SUBTRAÇÃO \n"
				+ " 3 - MULTIPLICAÇÃO \n"
				+ " 4 - DIVISÃO \n"
				+ " 5 - EXPONENCIAÇÃO \n"
				+ " 6 - RAIZ QUADRADA \n");
		
		System.out.print("Escolha a operação que deseja realizar: ");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		//Soma
		case 1: 
			System.out.print("Digite o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			resultado = num1 + num2;
			System.out.println("Resultado: "+resultado);
			break;
			
		//Subtração
		case 2:
			System.out.print("Digite o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			resultado = num1 - num2;
			System.out.println("Resultado: "+resultado);
            break;
             
        //Multiplicação
		case 3:
			System.out.print("Digite o primeiro número: ");
			num1 = entrada.nextDouble();
			System.out.print("Digite o segundo número: ");
			num2 = entrada.nextDouble();
			resultado = num1 * num2;
			System.out.println("Resultado: "+resultado);
            break;
            
        //Divisão
		case 4: 
			System.out.print("Digite o dividendo: ");
			num1 = entrada.nextDouble();
			System.out.print("Digite o divisor: ");
			num2 = entrada.nextDouble();
			if (num2 == 0) {
				System.out.println("Não é possível dividir por zero!");
			}else {
				resultado = num1/num2;
				System.out.println("Resultado: "+resultado);
			}
			break;
			
		//Exponenciação
		case 5:
			System.out.print("Digite a base: ");
			num1 = entrada.nextDouble();
			System.out.print("Digite o expoente: ");
			num2 = entrada.nextDouble();
			resultado = Math.pow(num1, num2);
            System.out.println("Resultado: "+resultado);
            break;
            
        //Raiz Quadrada   
		case 6:
			System.out.print("Digite o número: ");
			num1 = entrada.nextDouble();
			if (num1 < 0) {
				System.out.println("Não é possível calcular raiz quadrada real de numero negativo!");
			}else {
				resultado = Math.sqrt(num1);
				System.out.println("Resultado: "+resultado);
			}
			break;
			
			default: System.out.println("Opção inválida!");
		}

	}

}
