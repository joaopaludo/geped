package BEE2986;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		long total = 0, umDegrau = 1, doisDegraus = 2, tresDegraus = 4;

		if (n < 4 && n >= 0) {
			switch (n) {
			case 1:
				System.out.println(umDegrau);
				break;
			case 2:
				System.out.println(doisDegraus);
				break;
			case 3:
				System.out.println(tresDegraus);
				break;
			default:
				System.out.println(0);
				break;
			}
		} else {
			for (int i = 3; i < n; i++) {
				total = (umDegrau + doisDegraus + tresDegraus);
				umDegrau = doisDegraus;
				doisDegraus = tresDegraus;
				tresDegraus = (total % 1000000007);
			}

			System.out.println(total % 1000000007);
		}

		teclado.close();
	}
}
