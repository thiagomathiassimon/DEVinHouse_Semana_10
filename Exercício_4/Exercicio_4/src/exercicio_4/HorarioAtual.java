package exercicio_4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HorarioAtual {

	public static void main(String[] args) {

		Date date = new Date();

		String hours = new SimpleDateFormat("HH").format(date);
		String minutes = new SimpleDateFormat("mm").format(date);

		int hora = Integer.parseInt(hours);
		int minutos = Integer.parseInt(minutes);

		String saudacao;

		if (hora > 12) {

			saudacao = "Boa tarde";

		} else {

			saudacao = "Bom dia";

		}

		if (minutos < 10) {

			minutes = "0" + minutos;

		}

		System.out.format("%s, no momento são %s:%s.", saudacao, hours, minutes);

	}

}
