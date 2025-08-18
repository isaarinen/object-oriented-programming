import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit:");
        int fahrenheit = Integer.parseInt(reader.nextLine());

        System.out.printf((fahrenheit)+" fahrenheit is "+((fahrenheit - 32) / 1.8)+" celsius.");
    }
}