package BEE1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt(), Y = teclado.nextInt();

        for (int i = 1; i <= Y;) {
            for (int j = 1; j <= X; j++) {
                System.out.print(i);
                if (j < X) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }
                i++;
            }
        }

        teclado.close();
    }
}
