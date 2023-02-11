package BEE1146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int X = teclado.nextInt();

        while (X > 0) {
            String str = "";

            for (int i = 1; i <= X; i++) {
                str += i + " ";
            }

            System.out.println(str.trim());

            X = teclado.nextInt();
        }

        teclado.close();
    }
}
