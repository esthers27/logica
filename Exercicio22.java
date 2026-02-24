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

        int menor, meio, maior;

        // Encontrar o menor
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("Ordem crescente: " + menor + " " + meio + " " + maior);
		
		 //escreva seu código aqui
		
		input.close();
	}
}