import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Weight (g): ");
        int weight = Integer.parseInt(reader.nextLine());
        int leiviska = (int) (weight/13.28/32/20);
        double weight2 = (weight - leiviska * 20 * 32* 13.28);
        int naula = (int) ((weight2)/13.28 / 32);
        double weight3 = (weight2 - naula * 32 * 13.28);
        double luoti = Math.round((weight3 / 13.28)*100.0)/100.0;


        System.out.printf((weight)+" grams is "+(leiviska)+" leiviskä, "+(naula)+" naula "+ luoti+" luoti.");
    }
}