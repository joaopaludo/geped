import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dist = teclado.nextInt();
        double combGasto = teclado.nextDouble();

        System.out.printf("%.3f km/l\n", ((double) dist) / combGasto);

        teclado.close();
    }
}
