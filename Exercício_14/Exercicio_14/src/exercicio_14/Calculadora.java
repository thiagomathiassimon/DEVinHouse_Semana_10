package exercicio_14;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe o primeiro número.");
		double numero1 = Double.parseDouble(scanner.nextLine());
		System.out.println("Sr. Usuário, informe o segundo número.");
		double numero2 = Double.parseDouble(scanner.nextLine());
		System.out.println("Sr. Usuário, escolha uma dentre estas opções: somar, subtrair, multiplicar ou dividir.");
		String operacao = scanner.nextLine();

		double resultado = 0;

		if (operacao.equalsIgnoreCase("somar")) {

			resultado = numero1 + numero2;

		} else if (operacao.equalsIgnoreCase("subtrair")) {

			resultado = numero1 - numero2;

		} else if (operacao.equalsIgnoreCase("multiplicar")) {

			resultado = numero1 * numero2;

		} else if (operacao.equalsIgnoreCase("dividir")) {

			resultado = numero1 / numero2;

		}

		System.out.format("O resultado é: %.2f.", resultado);

		scanner.close();

	}

}
