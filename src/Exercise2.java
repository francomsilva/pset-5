import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        if(integer % 2 == 0){
            System.out.println("\nEven.");
        } else{
            System.out.println("\nOdd.");
        }
        input.close();
    }
}