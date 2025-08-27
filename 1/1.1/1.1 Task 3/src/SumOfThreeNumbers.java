import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        int sum =  first + second + third;
        int product = first * second * second;
        double average = (double) sum / 3; // doubles don't get truncated as a decimal, and allow for more digits than floats
        System.out.println("The sum of the numbers is " + (sum));
        System.out.println("The product of the numbers is " + (product));
        System.out.println("The average of the numbers is " + (average));
    }
}