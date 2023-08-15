package BEE1074;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casos = teclado.nextInt();
		
		for (int i = 0; i < casos; i++) {
			int n = teclado.nextInt();
			StringBuilder msg = new StringBuilder();
			
			if (n == 0) {
				msg.append("NULL");
			} else {
				if (n % 2 == 0) {
					msg.append("EVEN ");
				} else {
					msg.append("ODD ");
				}
				
				if (n > 0) {
					msg.append("POSITIVE");
				} else {
					msg.append("NEGATIVE");
				}
			}
			
			System.out.println(new String(msg));
		}

		teclado.close();
	}
}
