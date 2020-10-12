import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        if (integer > 0) {
            System.out.print("\nPositive.\n");
        } else if (integer == 0) {
            System.out.print("\nZero.\n");
        } else {
            System.out.print("\nNegative.\n");
        }
        input.close();
    }
}