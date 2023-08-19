package BEE1045;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double[] abc = new double[3];
		for (int i = 0; i < 3; i++) {
			abc[i] = teclado.nextDouble();
		}

		double aux;
		for (int j = 1; j < 3; j++) {
			if(abc[j] > abc[j-1]) {
				aux = abc[j-1];
				abc[j-1] = abc[j];
				abc[j] = aux;
			}
		}
		if(abc[0] < abc[1]) {
			aux = abc[0];
			abc[0] = abc[1];
			abc[1] = aux;
		}

		double a = abc[0];
		double b = abc[1];
		double c = abc[2];
		
		String msg = new String();
		
		if (a >= (b+c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			double a2 = Math.pow(a, 2);
			double b2 = Math.pow(b, 2);
			double c2 = Math.pow(c, 2);
			
			if (a2 == b2+c2) {
				msg = "TRIANGULO RETANGULO";
			} else if (a2 > b2 + c2) {
				msg = "TRIANGULO OBTUSANGULO";
			} else if (a2 < b2 + c2) {
				msg = "TRIANGULO ACUTANGULO";
			}
			
			System.out.println(msg);

			if (a == b || b == c || a == c) {
				if (a == c && c == b) {
					System.out.println("TRIANGULO EQUILATERO");
				} else {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}

		teclado.close();
	}
}
