//Escrever um programa para determinar o consumo médio de um automóvel, 
//sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. 

import  java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    double kmi;
        double litros;
        double consumoMedio;

        System.out.println("Digite a distância total percorrida (km): ");
        kmi = input.nextDouble();

        System.out.println("Digite o total de combustível gasto (litros): ");
        litros = input.nextDouble();

        consumoMedio = kmi / litros;

        System.out.printf("O consumo médio do automóvel é: %.2f km/l", consumoMedio);

		 //escreva seu código aqui

		input.close();
	}
}
