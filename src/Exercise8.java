import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String temperature = input.nextLine();
        String temperatureScale = temperature.substring(temperature.length()-1).toUpperCase();
        double temperatureValue = Double.parseDouble(temperature.substring(0, temperature.length()-1));

        if (temperatureScale.equals("F")) {
            if (temperatureValue >= 212) {
                System.out.print("\nGas.\n");
            } else if (temperatureValue >= 32) {
                System.out.print("\nLiquid.\n");
            } else {
                System.out.print("\nSolid.\n");
            }
        } else if (temperatureScale.equals("C")) {
            if (temperatureValue >= 100) {
                System.out.print("\nGas.\n");
            } else if (temperatureValue >= 0) {
                System.out.print("\nLiquid.\n");
            } else {
                System.out.print("\nSolid.\n");
            }
        } else {
            System.out.print("That's not a valid scale.");
        }

        input.close();
    }
}