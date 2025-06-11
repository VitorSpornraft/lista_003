import java.util.Locale;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double x = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double y = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double z = sc.nextDouble();

        double delta = y * y - 4 * x * z;

        if (delta < 0) {
            System.out.println("Esta equacao nao possui raizes reais");
        } else {
            double x1 = (-y + Math.sqrt(delta)) / (2 * x);
            double x2 = (-y - Math.sqrt(delta)) / (2 * x);

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }
        sc.close();
    }
}