package exercicio_5;

import java.util.Locale;

public class IdiomaAtual {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();

		String language = locale.getDisplayLanguage();
		String idioma = System.getProperty("user.language");

		System.out.format("O idioma do seu sistema é %s - %s.", idioma.toUpperCase(), language.toUpperCase());

	}

}
