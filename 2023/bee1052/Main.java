package BEE1052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		System.out.println(meses[n - 1]);

		teclado.close();
	}
}
