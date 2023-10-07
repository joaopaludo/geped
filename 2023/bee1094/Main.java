package BEE1094;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();
		teclado.nextLine();

		int c = 0, r = 0, s = 0;

		for (int i = 0; i < n; i++) {
			String input = teclado.nextLine();

			switch (input.charAt(input.length() - 1)) {
			case 'C':
				c += Integer.parseInt(input.substring(0, input.indexOf(" ")));
				break;
			case 'R':
				r += Integer.parseInt(input.substring(0, input.indexOf(" ")));
				break;
			case 'S':
				s += Integer.parseInt(input.substring(0, input.indexOf(" ")));
				break;
			}
		}
		
		int total = (c+r+s);
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + c);
		System.out.println("Total de ratos: " + r);
		System.out.println("Total de sapos: " + s);
		System.out.printf("Percentual de coelhos: %.2f %%\n", Double.parseDouble(String.valueOf((double)c*100/total)));
		System.out.printf("Percentual de ratos: %.2f %%\n", Double.parseDouble(String.valueOf((double)r*100/total)));
		System.out.printf("Percentual de sapos: %.2f %%\n", Double.parseDouble(String.valueOf((double)s*100/total)));

		teclado.close();
	}
}
