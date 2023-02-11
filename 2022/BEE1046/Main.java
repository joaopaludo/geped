package BEE1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horain = teclado.nextInt(), horafi = teclado.nextInt(), tempo;

        if (horain < horafi) {
            tempo = (horafi - horain);
        } else {
            tempo = (24 - horain) + (horafi);
        }

        System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        teclado.close();
    }
}