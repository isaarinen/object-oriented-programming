import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter number of integers: ");
    int n = Integer.parseInt(reader.nextLine());
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Enter integer " +(i + 1) +": ");
        array[i] = Integer.parseInt(reader.nextLine());
    }
    int biggestsum = 0;
    int firstint = 0;
    int lastint = 0;
    for (int i = 0; i < array.length; i++) {
        int sum = array[i];
        for  (int j = i + 1; j < array.length; j++) {
            sum  += array[j];
            if (sum > biggestsum) {
                biggestsum = sum;
                firstint = i + 1;
                lastint = j + 1;
            }
        }
    }
    System.out.println("Maximum sum: " + biggestsum);
    System.out.println("Integers: " + firstint + "-" + lastint);
    }
}