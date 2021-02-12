package exercicio_16;

import java.util.Scanner;

public class Progressao {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sr. Usuário, informe, por obséquio, um valor inicial.");
		int valorInicial = Integer.parseInt(scanner.nextLine());

		System.out.println("Sr. Usuário, informe, por obséquio, um valor para a raiz.");
		int raiz = Integer.parseInt(scanner.nextLine());

		System.out.println("Sr. Usuário, deseja calcular uma P.A. ou uma P.G.?");
		String progressao = scanner.nextLine();

		int resultado[] = new int[10];

		switch (progressao) {
			case "P.A.", "p.a.", "PA", "pa":
				for (int i = 0; i < 10; i++) {
					resultado[i] = valorInicial;
					valorInicial = resultado[i] + raiz;
				}
				break;
			case "P.G.", "p.g.", "PG", "pg":
				for (int i = 0; i < 10; i++) {
					resultado[i] = valorInicial * raiz;
					valorInicial = resultado[i];
				}
				break;
		}

		System.out.format("Sua %s: ", progressao);
		for (int i = 0; i < resultado.length; i++) {
			if (i != 9) {
				System.out.format("%d, ", resultado[i]);
			} else {
				System.out.format("%d.", resultado[i]);

			}
		}
		scanner.close();
	}

}
