package exercicio_8;

import java.util.Scanner;

public class ConversaoParaInteiro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe, por obséquio, um número com duas ou mais casas decimais.");
		double numeroDouble = scanner.nextDouble();

		int numeroInteiro = (int) numeroDouble;
		System.out.format("O número inteiro correspondente ao número por vós informado é: %d.", numeroInteiro);

		scanner.close();
	}
}
