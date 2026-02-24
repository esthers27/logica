/* Acrescente as seguintes mensagens à solução da tarefa 14 conforme o caso.
 * Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
 * Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. */

import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int lados;
        double ladoMedida;
        double area;

        System.out.print("Digite o número de lados do polígono: ");
        lados = input.nextInt();

        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");

        } else if (lados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");

        } else {
            System.out.print("Digite a medida do lado (cm): ");
            ladoMedida = input.nextDouble();

            if (lados == 3) {
                area = (ladoMedida * ladoMedida) * Math.sqrt(3) / 4;
                System.out.println("TRIÂNGULO");
                System.out.printf("Área: %.2f cm²%n", area);

            } else if (lados == 4) {
                area = ladoMedida * ladoMedida;
                System.out.println("QUADRADO");
                System.out.printf("Área: %.2f cm²%n", area);

            } else { 
                System.out.println("PENTÁGONO");
            }
        }
		 //escreva seu código aqui
		
		input.close();
	}
}