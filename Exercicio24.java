/* Escreva um programa para ler a altura, peso e gênero para calcular o IMC.
*/

import java.util.Scanner;

public class Exercicio24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int genero;
		double altura, pesoIdeal = 0;
		
		System.out.print("Digite o sexo (1 - feminino, 2 - masculino): ");
		genero = input.nextInt();
		
		System.out.print("Digite a altura: ");
		altura = input.nextDouble();
		
		 //escreva seu código aqui
		
		input.close();
	}
}