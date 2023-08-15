package BEE1042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		List<Integer> vet = new ArrayList<>();
		
		vet.add(teclado.nextInt());
		vet.add(teclado.nextInt());
		vet.add(teclado.nextInt());

		List<Integer> ord = new ArrayList<>(vet);
		
		Collections.sort(ord);
		
		for (int i = 0; i < ord.size(); i++) {
			System.out.println(ord.get(i));
		}
		System.out.println();
		for (int j = 0; j < vet.size(); j++) {
			System.out.println(vet.get(j));
		}
		
		teclado.close();
	}
}
