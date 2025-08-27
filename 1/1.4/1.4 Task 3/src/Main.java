import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = Integer.parseInt(reader.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " +(i + 1) +": ");
            array[i] = Integer.parseInt(reader.nextLine());
        }
        int[] betterarray = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for  (int j = 0; j < index; j++) {
                if (array[i] == betterarray[j]) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                betterarray[index] = array[i];
                index++;
            }
        }
        System.out.println("The array without duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(betterarray[i] + " ");
        }
    }
}