/* Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poder� ou n�o votar este ano 
 * (não é necessário considerar o mês em que ela nasceu). */

import java.util.Scanner;

 public class Exercicio20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int anoNascimento;
        int anoAtual = 2026; // pode ajustar se quiser
        int idade;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = input.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Pode votar este ano.");
        } else {
            System.out.println("Não pode votar este ano.");
        }
		//escreva seu código aqui
		
		input.close();
	}
}