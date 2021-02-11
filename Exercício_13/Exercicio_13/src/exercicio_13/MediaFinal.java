package exercicio_13;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe a primeira nota do semestre.");
		double nota1 = scanner.nextDouble();
		System.out.println("Sr. Usuário, informe a segunda nota do semestre.");
		double nota2 = scanner.nextDouble();
		System.out.println("Sr. Usuário, informe a terceira nota do semestre.");
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.format("Sua média final é: %.2f.", media);

		scanner.close();

	}

}
