package exercicio_12;

import java.util.Scanner;

public class Paridade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, por obséquio, informe um número inteiro.");
		int numero = scanner.nextInt();

		String paridade = (numero % 2 == 0) ? "par" : "ímpar";

		System.out.format("O número é %s.", paridade);

		scanner.close();
	}
}
