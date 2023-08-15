package BEE1041;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double x = teclado.nextDouble();
		double y = teclado.nextDouble();

		if (x == 0.0) {
			if (y == 0.0) {
				System.out.println("Origem");
			} else {
				System.out.println("Eixo Y");
			}
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else {
			if (y > 0) {
				if (x > 0) {
					System.out.println("Q1");
				} else {
					System.out.println("Q2");
				}
			} else {
				if (x > 0) {
					System.out.println("Q4");
				} else {
					System.out.println("Q3");
				}
			}
		}

		teclado.close();
	}
}
