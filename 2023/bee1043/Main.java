package BEE1043;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		double maior = 0.0;
		
		if (a > maior) maior = a;
		if (b > maior) maior = b;
		if (c > maior) maior = c;
		
		if ((a+b > c && c == maior) || (a+c > b && b == maior) || (b+c > a && a == maior)) {
			System.out.printf("Perimetro = %.1f\n", a+b+c);
		} else {
			System.out.printf("Area = %.1f\n", (a+b)*c/2);
		}
		
		teclado.close();
	}
}
