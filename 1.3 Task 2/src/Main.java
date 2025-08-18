import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = reader.nextLine();
        String reversed = "";
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            reversed = c + reversed;
        }
        int num = 0;
        for (int i = 0; i < reversed.length(); i++) {
            char n = reversed.charAt(i);
            if (n == '1') {
                num += (int) Math.pow(2, i);

            }

        }
        System.out.print(binary+" in base10: "+num);
    }
}