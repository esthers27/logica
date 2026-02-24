/* 
Uma empresa possui dez funcionários com as seguintes características: código, número de horas trabalhadas no mês, turno de trabalho (M – Matutino, V – Vespertino ou N – Noturno), categoria (O – Operário ou G – Gerente), valor da hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, faça um programa que: 
a) leia as informações dos funcionários, exceto o valor da hora trabalhada, não permitindo que sejam informados 
turnos nem categoria inexistentes. Trabalhe sempre com a digitação de letras maiúsculas; 
b) calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor de R$ 450,00 para o salário mínimo. 
 
Categoria  Turno  Valor da hora trabalhada 
G  N  18% do salário mínimo 
G  M ou V  15% do salário mínimo 
O  N  13% do salário mínimo 
O  M ou V  10% do salário mínimo 
 
c) calcule o salário inicial dos funcionários com base no valor da hora trabalhada e no número de horas trabalhadas; 
d) calcule o valor do auxílio-alimentação recebido por funcionário de acordo com o seu salário inicial, conforme a tabela a 
seguir. 

| Salário Inicial             |  Auxílio-Alimentação 
| Até R$ 300,00           | 20% do salário inicial 
| Entre R$ 300,00        |  e R$ 600,00  15% do salário inicial 
| Acima de R$ 600,00 |  5% do salário inicial 

e) mostre o código, número de horas trabalhadas, valor da hora trabalhada, salário inicial, auxílio-alimentação e salário 
final (salário inicial + auxilio-alimentação). 
 */

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigo, horasTrabalhadas;
        char turno, categoria;
        double valorHora, salarioInicial, auxilioAlimentacao, salarioFinal;
        double salarioMinimo = 450.00;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Funcionário " + i);

            System.out.print("Insira o código do funcionário: ");
            codigo = input.nextInt();

         
            turno = 'X';
            System.out.print("Turno (M - matutino, V - vespertino ou N - noturno): ");
            while (turno != 'M' && turno != 'V' && turno != 'N') {
                turno = input.next().charAt(0);
                if (turno != 'M' && turno != 'V' && turno != 'N') {
                    System.out.println("Turno inválido. Digite novamente:");
                }
            }

            categoria = 'X';
            System.out.print("Categoria (O - operário ou G - gerente): ");
            while (categoria != 'O' && categoria != 'G') {
                categoria = input.next().charAt(0);
                if (categoria != 'O' && categoria != 'G') {
                    System.out.println("Categoria inválida. Digite novamente:");
                }
            }

            System.out.print("Número de horas trabalhadas: ");
            horasTrabalhadas = input.nextInt();

        
            if (categoria == 'G') {
                if (turno == 'N') {
                    valorHora = salarioMinimo * 0.18;
                } else {
                    valorHora = salarioMinimo * 0.15;
                }
            } else { 
                if (turno == 'N') {
                    valorHora = salarioMinimo * 0.13;
                } else {
                    valorHora = salarioMinimo * 0.10;
                }
            }

            salarioInicial = horasTrabalhadas * valorHora;

            if (salarioInicial <= 300) {
                auxilioAlimentacao = salarioInicial * 0.20;
            } else if (salarioInicial <= 600) {
                auxilioAlimentacao = salarioInicial * 0.15;
            } else {
                auxilioAlimentacao = salarioInicial * 0.05;
            }

    
            salarioFinal = salarioInicial + auxilioAlimentacao;

            System.out.println("Código: " + codigo);
            System.out.println("Horas trabalhadas: " + horasTrabalhadas);
            System.out.printf("Valor da hora: R$ %.2f%n", valorHora);
            System.out.printf("Salário inicial: R$ %.2f%n", salarioInicial);
            System.out.printf("Auxílio-alimentação: R$ %.2f%n", auxilioAlimentacao);
            System.out.printf("Salário final: R$ %.2f%n", salarioFinal);
            System.out.println("--------------------------------------");
        }
			
			 //escreva seu código aqui

		input.close();
	} 
}