package BEE1051;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double salario = scan.nextDouble();

		if (salario <= 2000.00) {
			System.out.println("Isento");
		} else if (salario <= 3000.00) {
			salario -= 2000.00;

			System.out.println("R$ " + (String.format("%.2f", salario * 0.08)));
		} else if (salario <= 4500.00) {
			double IR = 80.00;

			salario -= 3000.00;
			IR += salario * 0.18;

			System.out.println("R$ " + String.format("%.2f", IR));
		} else {
			double IR = 80.00 + (0.18*1500);

			salario -= 4500.00;
			IR += salario * 0.28;

			System.out.println("R$ " + String.format("%.2f", IR));
		}

		scan.close();
	}
}
