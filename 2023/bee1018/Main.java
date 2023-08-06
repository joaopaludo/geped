package BEE1018;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valor = teclado.nextInt();
		
		System.out.println(valor);
		
		if (valor >= 100) {
			System.out.println(valor / 100 + " nota(s) de R$ 100,00");
			valor = valor % 100;
		} else {
			System.out.println("0 nota(s) de R$ 100,00");
		}
		
		if (valor >= 50) {
			System.out.println(valor / 50 + " nota(s) de R$ 50,00");
			valor = valor % 50;
		} else {
			System.out.println("0 nota(s) de R$ 50,00");
		}
		
		if (valor >= 20) {
			System.out.println(valor / 20 + " nota(s) de R$ 20,00");
			valor = valor % 20;
		} else {
			System.out.println("0 nota(s) de R$ 20,00");
		}
		
		if (valor >= 10) {
			System.out.println(valor / 10 + " nota(s) de R$ 10,00");
			valor = valor % 10;
		} else {
			System.out.println("0 nota(s) de R$ 10,00");
		}
		
		if (valor >= 5) {
			System.out.println(valor / 5 + " nota(s) de R$ 5,00");
			valor = valor % 5;
		} else {
			System.out.println("0 nota(s) de R$ 5,00");
		}

		if (valor >= 2) {
			System.out.println(valor / 2 + " nota(s) de R$ 2,00");
			valor = valor % 2;
		} else {
			System.out.println("0 nota(s) de R$ 2,00");
		}
		
		if (valor > 0) {
			System.out.println(valor + " nota(s) de R$ 1,00");
		} else {
			System.out.println("0 nota(s) de R$ 1,00");
		}

		teclado.close();
	}
}
