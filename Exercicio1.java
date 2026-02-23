// Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.

import java.util.Scanner; 

public class Exercicio1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);   
		 
		 int x, y; // primeiro número e segundo número 
		 int soma, subt, div, mult; // operações  
		 
		 System.out.print("Digite o primeiro número:" );   
		 x = input.nextInt();   
		 System.out.print("Digite o segundo número:" );   
		 y = input.nextInt();   
		 soma = x + y;
		 subt = x - y;
		 mult = x * y;

		 System.out.println("O resultado da Soma: " + soma);
		 System.out.println("O resultado da Subtração: " + subt);
		 System.out.println("O resultado da Multiplicação: " + mult);

		 if (y != 0) {
			double divisao = (double) x / y;
			System.out.println("O resultado da Divisão: " + divisao);
		 } else 
		 {
			System.out.println("O resultado não pode ser dividido por 0");
		}
		 
		 //escreva seu código aqui

		 input.close();
	}
}