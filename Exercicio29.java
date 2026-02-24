// Desenvolva um programa que dado um número, imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3. 

import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if (numero % 3 == 0) {
            System.out.println("É múltiplo de 3");
        } else {
            System.out.println("Não é múltiplo de 3");
        }
		//escreva seu código aqui
		
		input.close();
	}
}