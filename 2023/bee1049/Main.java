package BEE1049;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String p1 = teclado.nextLine();
		String p2 = teclado.nextLine();
		String p3 = teclado.nextLine();

		if (p1.equals("vertebrado")) {
			if (p2.equals("ave")) {
				if (p3.equals("carnivoro"))
					System.out.println("aguia");
				else
					System.out.println("pomba");
			} else {
				if (p3.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		} else {
			if (p2.equals("inseto")) {
				if (p3.equals("hematofago"))
					System.out.println("pulga");
				else
					System.out.println("lagarta");
			} else {
				if (p3.equals("hematofago"))
					System.out.println("sanguessuga");
				else
					System.out.println("minhoca");
			}
		}

		teclado.close();
	}
}
