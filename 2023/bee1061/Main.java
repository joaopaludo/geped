package BEE1061;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int diaIni = Integer.parseInt(teclado.nextLine().substring(4));
		int[] tempIni = Arrays.stream(teclado.nextLine().replaceAll(" ", "").split(":")).mapToInt(Integer::parseInt)
				.toArray();
		int diaFin = Integer.parseInt(teclado.nextLine().substring(4));
		int[] tempFin = Arrays.stream(teclado.nextLine().replaceAll(" ", "").split(":")).mapToInt(Integer::parseInt)
				.toArray();

		LocalDateTime inicioEvento = LocalDateTime.of(2023, 4, diaIni, tempIni[0], tempIni[1], tempIni[2]);
		LocalDateTime fimEvento = LocalDateTime.of(2023, 4, diaFin, tempFin[0], tempFin[1], tempFin[2]);

		Duration duracaoEvento = Duration.between(inicioEvento, fimEvento);

		System.out.println(duracaoEvento.toDays() + " dia(s)");
		duracaoEvento = duracaoEvento.minusDays(duracaoEvento.toDays());

		System.out.println(duracaoEvento.toHours() + " hora(s)");
		duracaoEvento = duracaoEvento.minusHours(duracaoEvento.toHours());

		System.out.println(duracaoEvento.toMinutes() + " minuto(s)");
		duracaoEvento = duracaoEvento.minusMinutes(duracaoEvento.toMinutes());

		System.out.println(duracaoEvento.toSeconds() + " segundo(s)");

		teclado.close();
	}
}
