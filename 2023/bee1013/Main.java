package BEE1013;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		int maiorAB = (a + b + Math.abs(a-b)) / 2;
		int maior = (maiorAB + c + Math.abs(maiorAB-c)) / 2;
		
		System.out.println(maior + " eh o maior");

		teclado.close();
	}
}
