import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int points = 0;
        boolean problems = true;
        Scanner reader  = new Scanner(System.in);
        Random rand = new Random();

        while (problems) {
            for (int i = 1; i <= 10; i++) {
                int i1  = rand.nextInt(9) + 1;
                int i2  = rand.nextInt(9) + 1;
                System.out.print("What is " + (i1) + "*" + (i2) + "? ");
                int answer = Integer.parseInt(reader.nextLine());
                if (answer == i1 * i2) {
                    points++;
                }
            }
            if (points == 10) {
                problems = false;
                System.out.println("Congratulations! You've mastered the multiplication tables!");
            }
            else {
                points = 0;
            }
        }
    }
}