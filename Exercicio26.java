// Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usuário não informará valores iguais.


import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3;
        int maior;

        System.out.print("Digite o primeiro valor: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior valor é: " + maior);
		 //escreva seu código aqui
		
		input.close();

	}
}