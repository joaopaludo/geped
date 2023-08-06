package BEE1021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double lido = teclado.nextDouble();
		
		int valor = (int)(lido * 100);

		System.out.println("NOTAS:");
		
		if (valor >= 10000) {
			System.out.println(valor / 10000 + " nota(s) de R$ 100.00");
			valor = valor % 10000;
		} else {
			System.out.println("0 nota(s) de R$ 100.00");
		}
		
		if (valor >= 5000) {
			System.out.println(valor / 5000 + " nota(s) de R$ 50.00");
			valor = valor % 5000;
		} else {
			System.out.println("0 nota(s) de R$ 50.00");
		}
		
		if (valor >= 2000) {
			System.out.println(valor / 2000 + " nota(s) de R$ 20.00");
			valor = valor % 2000;
		} else {
			System.out.println("0 nota(s) de R$ 20.00");
		}
		
		if (valor >= 1000) {
			System.out.println(valor / 1000 + " nota(s) de R$ 10.00");
			valor = valor % 1000;
		} else {
			System.out.println("0 nota(s) de R$ 10.00");
		}
		
		if (valor >= 500) {
			System.out.println(valor / 500 + " nota(s) de R$ 5.00");
			valor = valor % 500;
		} else {
			System.out.println("0 nota(s) de R$ 5.00");
		}

		if (valor >= 200) {
			System.out.println(valor / 200 + " nota(s) de R$ 2.00");
			valor = valor % 200;
		} else {
			System.out.println("0 nota(s) de R$ 2.00");
		}

		System.out.println("MOEDAS:");

		if (valor >= 100) {
			System.out.println(valor / 100 + " moeda(s) de R$ 1.00");
			valor = valor % 100;
		} else {
			System.out.println("0 moeda(s) de R$ 1.00");
		}
		
		if (valor >= 50) {
			System.out.println(valor / 50 + " moeda(s) de R$ 0.50");
			valor = valor % 50;
		} else {
			System.out.println("0 moeda(s) de R$ 0.50");
		}
		
		if (valor >= 25) {
			System.out.println(valor / 25 + " moeda(s) de R$ 0.25");
			valor = valor % 25;
		} else {
			System.out.println("0 moeda(s) de R$ 0.25");
		}
		
		if (valor >= 10) {
			System.out.println(valor / 10 + " moeda(s) de R$ 0.10");
			valor = valor % 10;
		} else {
			System.out.println("0 moeda(s) de R$ 0.10");
		}
		
		if (valor >= 5) {
			System.out.println(valor / 5 + " moeda(s) de R$ 0.05");
			valor = valor % 5;
		} else {
			System.out.println("0 moeda(s) de R$ 0.05");
		}
		
		if (valor > 0) {
			System.out.println(valor + " moeda(s) de R$ 0.01");
		} else {
			System.out.println("0 moeda(s) de R$ 0.01");
		}

		teclado.close();
	}
}
