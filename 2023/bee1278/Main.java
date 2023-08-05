package BEE1278;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int lin;

		while (true) {
			lin = teclado.nextInt();
			if (lin == 0)
				break;

			teclado.nextLine();

			String[] linhas = new String[lin];

			int compMaiorLinha = 0;

			for (int i = 0; i < lin; i++) {
				linhas[i] = teclado.nextLine().trim();

				String regex = "\\s{2,}";

				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(linhas[i]);

				linhas[i] = matcher.replaceAll(" ");

				if (linhas[i].length() > compMaiorLinha)
					compMaiorLinha = linhas[i].length();
			}

			for (String linha : linhas) {
				while (linha.length() < compMaiorLinha) {
					linha = " " + linha;
				}

				System.out.println(linha);
			}
		}

		teclado.close();

	}
}
