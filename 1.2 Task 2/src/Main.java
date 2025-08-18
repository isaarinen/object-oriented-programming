import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the length of the first leg:");
        double leg1 = Double.parseDouble(reader.nextLine());
        System.out.println("Enter the length of the second leg:");
        double leg2 = Double.parseDouble(reader.nextLine());

        System.out.printf("The hypotenuse's length is " + (Math.hypot(leg1, leg2)));
    }
}