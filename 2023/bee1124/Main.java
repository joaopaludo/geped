package BEE1124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = -1, c = -1, r1 = -1, r2 = -1;

		while (true) {
			l = scanner.nextInt();
			c = scanner.nextInt();
			r1 = scanner.nextInt();
			r2 = scanner.nextInt();

			if (l == 0 && c == 0 && r1 == 0 && r2 == 0)
				break;

			int h = (r1 * 2) + (r2 * 2);

			double distanciaCentros = Math.round(Math.sqrt(Math.pow(c - r1 - r2, 2) + Math.pow(l - r1 - r2, 2)));

			if (r1 > l || r1 > c || r2 > l || r2 > c || (r1 * 2 > l) || (r1 * 2 > c) || (r2 * 2 > l) || (r2 * 2 > c)) {
				System.out.println("N");
				continue;
			}

			if (h <= l || h <= c) {
				System.out.println("S");
			} else {
				if (distanciaCentros >= r1 + r2) {
					System.out.println("S");
				} else {
					System.out.println("N");
				}
			}
		}

		scanner.close();
	}
}