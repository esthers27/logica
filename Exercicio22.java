// Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		num2 = input.nextInt();
		
		System.out.print("Digite o terceiro valor: ");
		num3 = input.nextInt();
		
		 //escreva seu código aqui
		
		input.close();
	}
}