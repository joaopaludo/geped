package BEE1257;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int times = 0;
		times = teclado.nextInt();

		for (int i = 0; i < times; i++) {

			int somaHash = 0;
			int linhasEntrada = 0;

			if (teclado.hasNextLine()) {
				linhasEntrada = teclado.nextInt();
			} else {
				break;
			}

			teclado.nextLine();

			for (int linha = 0; linha < linhasEntrada; linha++) {

				String entrada = teclado.nextLine();

				char[] letras = entrada.toCharArray();

				for (int letra = 0; letra < letras.length; letra++) {

					// -65 because of the ASCII value of the characters
					somaHash += ((int) letras[letra]) - 65 + letra + linha;

				}

			}

			System.out.println(somaHash);

		}

		teclado.close();

	}

}
