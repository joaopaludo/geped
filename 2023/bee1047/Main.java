package BEE1047;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int hi = teclado.nextInt();
		int mi = teclado.nextInt();
		int hf = teclado.nextInt();
		int mf = teclado.nextInt();
		
		int horas = hf - hi;
		if (horas == 0) {
			if (mf <= mi) horas = 24;
		} else if (horas < 0) {
			horas = 24 + (hf - hi);
		}
		
		if (mf < mi) horas--;
		
		int minutos = mf - mi < 0 ? 60 + (mf - mi) : mf - mi;
		
		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		
		teclado.close();
	}
}
