import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers.\n\nEnter Integer: ");
        int int1 = input.nextInt();
        System.out.print("Enter Integer: ");
        int int2 = input.nextInt();
        System.out.print("Enter Integer: ");
        int int3 = input.nextInt();

        if (int1 < int2 && int2 < int3) System.out.print("\nStrictly increasing.\n");
        if ((int1 < int2 && int2 == int3) || (int1 == int2 && int2 < int3)) System.out.print("\nIncreasing.\n");
        if (int1 == int2 && int2 == int3) System.out.print("\nSame.\n");
        if (int1 > int2 && int2 > int3) System.out.print("\nStrictly decreasing.\n");
        if ((int1 > int2 && int2 == int3) || (int1 == int2 && int2 > int3)) System.out.print("\nDecreasing.\n");
        if ((int1 > int2 && int2 < int3) || (int1 < int2 && int2 > int3)) System.out.print("\nUnordered.\n");

        input.close();
    }
}