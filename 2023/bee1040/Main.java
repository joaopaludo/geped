package BEE1040;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double n1 = teclado.nextDouble();
		double n2 = teclado.nextDouble();
		double n3 = teclado.nextDouble();
		double n4 = teclado.nextDouble();
		
		double media = ((n1*2.0) + (n2*3.0) + (n3*4.0) + (n4*1.0)) / 10;

		System.out.println(("Media: " + new DecimalFormat("#,#0.0").format(media)));
		
		if(media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			
			double notaExame = teclado.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			
			media = (media + notaExame) / 2.0;
			
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f\n", media);
		}
		
		teclado.close();
	}
}
