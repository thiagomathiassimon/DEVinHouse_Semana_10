package exercicio_7;

import java.util.Scanner;

public class NomeCompleto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe, por obséquio, seu sobrenome.");
		String sobrenome = scanner.nextLine();

		System.out.println("Sr. Usuário, informe, por obséquio, seu nome.");
		String nome = scanner.nextLine();

		String nomeCompleto = nome + " " + sobrenome;

		System.out.format("Seu nome completo é: %s.", nomeCompleto);

		scanner.close();
	}

}
