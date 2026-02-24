// Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
// O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double cotacaoDolar;
        double quantidadeDolar;
        double valorEmReais;
        
        System.out.print("Digite a cotação do dólar: ");
        cotacaoDolar = input.nextDouble();
        
        System.out.print("Digite a quantidade de dólares: ");
        quantidadeDolar = input.nextDouble();
        
        valorEmReais = cotacaoDolar * quantidadeDolar;
        
        System.out.println("Valor em reais (R$): " + valorEmReais);

		 //escreva seu código aqui

		 input.close();
	}
}
