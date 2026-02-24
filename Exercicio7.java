// Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. 
// Considere fixo o juro da poupança em 0.70% a. m.

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		 
		double valorDepositado;
        double rendimento;
        double valorFinal;
        
        System.out.print("Digite o valor depositado: ");
        valorDepositado = input.nextDouble();
        
        rendimento = valorDepositado * 0.007; // 0,70% = 0.007
        valorFinal = valorDepositado + rendimento;
        
        System.out.println("Valor após 1 mês com rendimento: R$ " + valorFinal);
        
		 //escreva seu código aqui		 

		input.close();
	}
}