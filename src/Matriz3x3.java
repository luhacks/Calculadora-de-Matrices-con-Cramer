import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaración de las variables
        int x1, x2, x3, y1, y2, y3, z1, z2, z3, r1, r2, r3;
        double d, dx, dy, dz, x, y, z;

        // Se leen las matrices.
        System.out.print("\n Ecuaciones lineales de 3 X 3");
        System.out.print("\n x1:");
        x1 = sc.nextInt();
        System.out.print("\n y1:");
        y1 = sc.nextInt();
        System.out.print("\n z1:");
        z1 = sc.nextInt();
        System.out.print("\n r1:");
        r1 = sc.nextInt();
        System.out.print("\n x2:");
        x2 = sc.nextInt();
        System.out.print("\n y2:");
        y2 = sc.nextInt();
        System.out.print("\n z2:");
        z2 = sc.nextInt();
        System.out.print("\n r2:");
        r2 = sc.nextInt();
        System.out.print("\n x3:");
        x3 = sc.nextInt();
        System.out.print("\n y3:");
        y3 = sc.nextInt();
        System.out.print("\n z3:");
        z3 = sc.nextInt();
        System.out.print("\n r3:");
        r3 = sc.nextInt();

        // Se calcula el determinante del sistema y los valores de x, y, z.
        d = (x1 * y2 * z3) + (y1 * z2 * x3) + (z1 * x2 * y3) - (z1 * y2 * x3) - (x1 * z2 * y3) - (y1 * x2 * z3);

        x = (r1 * y2 * z3) + (y1 * z2 * r3) + (z1 * r2 * y3) - (z1 * y2 * r3) - (r1 * z2 * y3) - (y1 * r2 * z3);

        y = (x1 * r2 * z3) + (r1 * z2 * x3) + (z1 * x2 * r3) - (z1 * r2 * x3) - (x1 * z2 * r3) - (r1 * x2 * z3);

        z = (x1 * y2 * r3) + (y1 * r2 * x3) + (r1 * x2 * y3) - (r1 * y2 * x3) - (x1 * r2 * y3) - (y1 * x2 * r3);

        // Se determina si los sistemas de ecuaciones son inconsistentes o consistentes.
        if (d == 0 & x == 0) {

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es consistente y tiene infinitas soluciones.");
            System.out.print("\n " + x1 + "x " + y1 + "y " + z1 + "z = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y " + z2 + "z = " + r2);
            System.out.print("\n " + x3 + "x " + y3 + "y " + z3 + "z = " + r3);
            System.out.print("\n El valor de la determinante es: " + d);
            System.out.print("\n El valor de x es: " + x + "/" + d);
            System.out.print("\n El valor de y es: " + y + "/" + d);
            System.out.print("\n El valor de z es: " + z + "/" + d);
            System.out.println("\n");

        } else if (d == 0 & x != 0) {

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es inconsistente y no tinene solución");
            System.out.print("\n " + x1 + "x " + y1 + "y " + z1 + "z = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y " + z2 + "z = " + r2);
            System.out.print("\n " + x3 + "x " + y3 + "y " + z3 + "z = " + r3);
            System.out.print("\n El valor de la determinante es: " + d);
            System.out.print("\n El valor de x es: " + x + "/" + d);
            System.out.print("\n El valor de y es: " + y + "/" + d);
            System.out.print("\n El valor de z es: " + z + "/" + d);
            System.out.println("\n");

        } else {

            dx = x / d;
            dy = y / d;
            dz = z / d;

            System.out.println("\n");
            System.out.println("El sistema de ecuaciones lineales es consistente y tiene una sola solución");
            System.out.print("\n " + x1 + "x " + y1 + "y " + z1 + "z = " + r1);
            System.out.print("\n " + x2 + "x " + y2 + "y " + z2 + "z = " + r2);
            System.out.print("\n " + x3 + "x " + y3 + "y " + z3 + "z = " + r3);
            System.out.print("\n El valor de la determinante es: " + d);
            System.out.print("\n El valor de la determinante de x: " + dx);
            System.out.print("\n El valor de la determinante de y: " + dy);
            System.out.print("\n El valor de la determinante de z: " + dz);
            System.out.println("\n");

        }
    }
}