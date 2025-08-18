import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Quadratic equation: ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = Double.parseDouble(reader.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(reader.nextLine());
        System.out.print("Enter c: ");
        double c = Double.parseDouble(reader.nextLine());
        double det = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(det)) / (2 * a);
        double x2 = (-b - Math.sqrt(det)) / (2 * a);
        if (det > 0) {
            System.out.printf("First root: " + (x1) + "\nSecond root: " + (x2));
        }
        else if (det == 0) {
            System.out.printf("Root: " + x1);
        }
        else {
            x1 = -b / (2 * a);
            x2 = Math.sqrt(-det) / (2 * a);
            System.out.printf("Roots are imaginary\nFirst root: " + (x1)+"+"+(x2)+ "i\nSecond root: " + (x1)+"-"+(x2)+ "i");
        }
    }
}