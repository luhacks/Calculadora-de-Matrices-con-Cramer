import java.util.Scanner;

public class Matriz2x2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaración de las variables
        int x1, x2, y1, y2, r1, r2;
        double d, dx, dy, x, y;

        // Se leen las matrices.
        System.out.print("\n Ecuaciones lineales de 2 X 2");
        System.out.print("\n x1:");
        x1 = sc.nextInt();
        System.out.print("\n y1:");
        y1 = sc.nextInt();
        System.out.print("\n r1:");
        r1 = sc.nextInt();
        System.out.print("\n x2:");
        x2 = sc.nextInt();
        System.out.print("\n y2:");
        y2 = sc.nextInt();
        System.out.print("\n r2:");
        r2 = sc.nextInt();

        // Se calcula el determinante del sistema y los valores de x, y.
        d = (x1 * y2) - (x2 * y1);

        x = (r1 * y2) - (r2 * y1);

        y = (x1 * r2) - (x2 * r1);

        if (d == 0 & x == 0) {

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es consistente y tiene infinitas soluciones.");
            System.out.print("\n " + x1 + "x " + y1 + "y = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y = " + r2);
            System.out.print("\n El valor del determinante es: " + d);
            System.out.print("\n El valor de x es: " + x + "/" + d);
            System.out.print("\n El valor de y es: " + y + "/" + d);
            System.out.println("\n");

            System.out.println();

        } else if (d == 0 & x != 0) {

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es inconsistente y no tinene solución");
            System.out.print("\n " + x1 + "x " + y1 + "y = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y = " + r2);
            System.out.print("\n El valor del determinante es: " + d);
            System.out.print("\n El valor de x es: " + x + "/" + d);
            System.out.print("\n El valor de y es: " + y + "/" + d);
            System.out.println("\n");

        } else {

            dx = x / d;
            dy = y / d;

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es consistente y tiene una sola solución");
            System.out.print("\n " + x1 + "x " + y1 + "y = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y = " + r2);
            System.out.print("\n El valor del determinante es: " + d);
            System.out.print("\n El valor de x es: " + dx);
            System.out.print("\n El valor de y es: " + dy);
            System.out.println("\n");

        }
    }
}