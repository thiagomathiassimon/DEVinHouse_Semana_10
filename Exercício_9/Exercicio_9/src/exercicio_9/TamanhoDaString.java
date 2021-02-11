package exercicio_9;

import java.util.Scanner;

public class TamanhoDaString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe, por obséquio, um nome qualquer.");
		String nome = scanner.nextLine();

		System.out.format("O tamanho do nome por vós informado é: %d.", nome.length());

		scanner.close();
	}

}
