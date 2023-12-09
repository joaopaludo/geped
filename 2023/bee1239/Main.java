package BEE1239;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String input = "";
		String[] inputChars;

		do {

			if (teclado.hasNextLine()) {
				input = teclado.nextLine();
			} else {
				break;
			}

			inputChars = input.split("");

			int countUnderline = 0;
			int countStar = 0;

			for (int i = 0; i < inputChars.length; i++) {
				if (inputChars[i].equals("_")) {
					countUnderline++;

					if (countUnderline % 2 != 0) {
						inputChars[i] = "<i>";
					} else {
						inputChars[i] = "</i>";
					}
				}

				if (inputChars[i].equals("*")) {
					countStar++;

					if (countStar % 2 != 0) {
						inputChars[i] = "<b>";
					} else {
						inputChars[i] = "</b>";
					}
				}
			}

			StringBuilder sb = new StringBuilder();

			for (String str : inputChars) {
				sb.append(str);
			}

			String result = sb.substring(0, sb.length());

			System.out.println(result);

		} while (!input.isEmpty());

		teclado.close();
	}
}
