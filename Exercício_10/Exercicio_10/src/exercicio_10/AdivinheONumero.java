package exercicio_10;

import java.util.Scanner;

public class AdivinheONumero {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numeroDoSistema = (int) (Math.random() * (5 - 1) + 1);

		System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando.");

		int numeroDoUsuario = scanner.nextInt();

		if (numeroDoSistema != numeroDoUsuario) {

			System.out.format("Você errou, o número correto era %d.", numeroDoSistema);

		} else {

			System.out.println("Você acertou!");

		}

		scanner.close();
	}

}
