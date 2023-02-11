package BEE1117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1 = -1, n2 = -1;
        int c1 = 0, c2 = 0;

        while (c1 != 1) {
            n1 = teclado.nextDouble();
            if ((n1 < 0) || (n1 > 10)) {
                System.out.println("nota invalida");
            } else {
                c1 = 1;
            }
        }

        while (c2 != 1) {
            n2 = teclado.nextDouble();
            if ((n2 < 0) || (n2 > 10)) {
                System.out.println("nota invalida");
            } else {
                c2 = 1;
            }
        }

        System.out.printf("media = %.2f%n", ((n1 + n2) / 2));

        teclado.close();
    }
}