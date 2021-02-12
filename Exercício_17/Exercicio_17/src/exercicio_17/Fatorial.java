package exercicio_17;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, por obséquio, informe um número de 0 a 10.");
		int numero = Integer.parseInt(scanner.nextLine());

		boolean faixaDeValor = false;
		for (int i = 0; i <= 10 && i >= 0; i++) {
			if (numero == i) {
				faixaDeValor = true;
			}
		}

		while (faixaDeValor != true) {
			System.out.println("O número informado não está entre 0 e 10, informe outro.");
			numero = Integer.parseInt(scanner.nextLine());

			for (int i = 0; i <= 10 && i >= 0; i++) {
				if (numero == i) {
					faixaDeValor = true;
				}
			}

		}

		int resultado = 0;

		if (numero == 0 || numero == 1) {
			resultado = 1;
		} else {

			for (int i = numero; i > 1; i--) {
				resultado = numero * (i - 1);
				numero = resultado;
			}
		}

		System.out.format("O fatorial desse número é: %d.", resultado);

		scanner.close();
	}

}
