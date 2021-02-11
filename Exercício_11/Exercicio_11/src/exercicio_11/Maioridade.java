package exercicio_11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {

		Date date = new Date();
		Scanner scanner = new Scanner(System.in);
		int diaAtual = Integer.parseInt(new SimpleDateFormat("dd").format(date));
		int mesAtual = Integer.parseInt(new SimpleDateFormat("MM").format(date));
		int anoAtual = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));

		System.out.println("Sr. Usuário, por obsóquio, informe sua data de nascimento no formato (DD/MM/AAAA).");
		String dataDeNascimento = scanner.nextLine();

		String nascimento[] = dataDeNascimento.split("/");

		int diaNascimento = Integer.parseInt(nascimento[0]);
		int mesNascimento = Integer.parseInt(nascimento[1]);
		int anoNascimento = Integer.parseInt(nascimento[2]);

		int idade;

		if (mesNascimento > mesAtual) {

			idade = (anoAtual - 1) - anoNascimento;

		} else if (mesNascimento == mesAtual) {

			if (diaNascimento <= diaAtual) {

				idade = anoAtual - anoNascimento;

			} else {

				idade = (anoAtual - 1) - anoNascimento;

			}

		} else {

			idade = anoAtual - anoNascimento;

		}

		if (idade >= 18) {

			System.out.println("Você é maior de idade.");

		} else {

			System.out.println("Você é menor de idade.");

		}

		scanner.close();
	}
}
