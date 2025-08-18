import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        String[] firstNames = {"Liam", "Ava", "Noah", "Mia", "Ethan", "Sophia", "Lucas", "Isabella", "James", "Olivia"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson", "Lee", "Walker", "Hall", "Young", "Clark"};
        System.out.print("How many random names should be generated? ");
        int amount = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < amount; i++) {
            int index1 = rand.nextInt(firstNames.length);
            int index2 = rand.nextInt(lastNames.length);
            System.out.println(firstNames[index1] + " " + lastNames[index2]);
        }
    }
}