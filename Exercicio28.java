/* Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo.
* Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
* Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
* Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º) */

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;

        System.out.print("Digite o primeiro ângulo: ");
        a = input.nextDouble();

        System.out.print("Digite o segundo ângulo: ");
        b = input.nextDouble();

        System.out.print("Digite o terceiro ângulo: ");
        c = input.nextDouble();

        if (a == 90 || b == 90 || c == 90) {
            System.out.println("Triângulo Retângulo");
        } 
        else if (a > 90 || b > 90 || c > 90) {
            System.out.println("Triângulo Obtusângulo");
        } 
        else {
            System.out.println("Triângulo Acutângulo");
        }
		 //escreva seu código aqui
		
		input.close();
	}
}