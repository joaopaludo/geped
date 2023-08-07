package BEE1036;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		double delta = (b * b) - (4 * a * c);
		
		if(delta < 0 || 2 * a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", (-b + Math.sqrt(delta)) / (2.0 * a));
			System.out.printf("R2 = %.5f\n", (-b - Math.sqrt(delta)) / (2.0 * a));
		}

		teclado.close();
	}
}
