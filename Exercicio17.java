/* Faça um programa que leia um conjunto não determinado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada de dados com um valor negativo ou zero. */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
        double quadrado, cubo, raiz;

        System.out.print("Digite um número maior que 0: ");
        num = input.nextInt();

        while (num > 0) {

            quadrado = Math.pow(num, 2);
            cubo = Math.pow(num, 3);
            raiz = Math.sqrt(num);

            System.out.println("Número: " + num);
            System.out.println("Quadrado: " + quadrado);
            System.out.println("Cubo: " + cubo);
            System.out.println("Raiz quadrada: " + raiz);
            System.out.println("-------------------------");

            System.out.print("Digite outro número maior que 0 (ou 0/negativo para sair): ");
            num = input.nextInt();
        }

        System.out.println("Programa finalizado.");
		//escreva seu código aqui
			
		input.close();
	}
}