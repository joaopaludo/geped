package BEE1581;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casos = teclado.nextInt();

		for (;casos > 0; casos--) {
			
			Boolean diferente = false;
			
			int pessoas = teclado.nextInt();
			teclado.nextLine();

			String[] idiomas = new String[pessoas];
			
			for (int i = 0; i < pessoas; i++) {
				idiomas[i] = teclado.nextLine();

				if (i > 0 && !idiomas[i].equals(idiomas[i-1])) {
					diferente = true;
				}
			}

			if (diferente) {
				System.out.println("ingles");
			} else {
				System.out.println(idiomas[0]);
			}
		}
		
		teclado.close();
	}
}
