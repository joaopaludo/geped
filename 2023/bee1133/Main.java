package BEE1133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n1, n2;
		int x1 = teclado.nextInt();
		int x2 = teclado.nextInt();

		if (x1 > x2) {
			n1 = x2;
			n2 = x1;
		} else {
			n1 = x1;
			n2 = x2;
		}
		
		n1++;

		for (; n1 < n2; n1++) {
			if (n1 % 5 == 2 || n1 % 5 == 3)
				System.out.println(n1);
		}

		teclado.close();
	}
}
