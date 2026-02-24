// Faça um programa que receba um número inteiro entre 1 e 7 e informe o dia da semana correspondente (1 = domingo, 2 = segunda).

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		int numero;

        System.out.print("Digite um número entre 1 e 7: ");
        numero = input.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
        }
		 //escreva seu código aqui
				
		input.close();
	}
}