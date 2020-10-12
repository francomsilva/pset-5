import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = input.nextLine().toLowerCase();

        if (month.equals("january") || month.equals("janu") || month.equals("jan")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("february") || month.equals("febr") || month.equals("feb")) {
            System.out.print("\n28 or 29 Days.\n");
        }
        else if (month.equals("march") || month.equals("marc") || month.equals("mar")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("april") || month.equals("apri") || month.equals("apr")) {
            System.out.print("\n30 Days.\n");
        }
        else if (month.equals("may")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("june") || month.equals("jun")) {
            System.out.print("\n30 Days.\n");
        }
        else if (month.equals("july") || month.equals("jul")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("august") || month.equals("augu") || month.equals("aug")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("september") || month.equals("sept") || month.equals("sep")) {
            System.out.print("\n30 Days.\n");
        }
        else if (month.equals("october") || month.equals("octo") || month.equals("oct")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("november") || month.equals("nove") || month.equals("nov")) {
            System.out.print("\n31 Days.\n");
        }
        else if (month.equals("december") || month.equals("dece") || month.equals("dec")) {
            System.out.print("\n31 Days.\n");
        }
        else {
            System.out.print("\nThat's not a valid month.\n");
        }

        input.close();
    }
}