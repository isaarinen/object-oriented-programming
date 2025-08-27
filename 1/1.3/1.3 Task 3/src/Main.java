import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter a second positive number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        for (int i = num1; i <= num2; i++) {
            boolean isPrime = true;
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime: "+i);
            }

        }
    }
}