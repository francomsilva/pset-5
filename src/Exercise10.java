import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

        double paycheck;

        if (wage < 0) {
            System.out.print("\nYour wage must be greater than or equal to $0.00/hour.\n");
        } else if (hours < 0) {
            System.out.print("\nYour hours must be greater than or equal to 0.0.\n");
        } else if (hours > 40) {
            paycheck = wage * 40 + (1.5 * (hours - 40) * wage);
            System.out.print("\nYou'll make ");
            System.out.printf("%,.2f", paycheck);
            System.out.print(" this week.\n");
        } else {
            paycheck = hours * wage;
            System.out.print("\nYou'll make ");
            System.out.printf("%,.2f", paycheck);
            System.out.print(" this week.\n");
        }

        input.close();
    }
}