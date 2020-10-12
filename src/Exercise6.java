import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        String card = input.nextLine();
        card = card.toUpperCase();
        boolean display = true;
        String rankInput = card.substring(0, 1);
        String suitInput = card.substring(1, 2);
        String rankOutput = "";
        String suitOutput = "";

        if (card.length() > 2) {
            display = false;
            System.out.print("\nThat's not a valid card.\n");
        } else {
            if (suitInput.equals("C")) {
                suitOutput = "Clubs";
            } else if (suitInput.equals("D")) {
                suitOutput = "Diamonds";
            } else if (suitInput.equals("H")) {
                suitOutput = "Hearts";
            } else if (suitInput.equals("S")) {
                suitOutput = "Spades";
            } else {
                display = false;
                System.out.print("\nThat's not a valid suit.\n");
            }

            if (rankInput.equals("2")){
                rankOutput = "Two";
            } else if (rankInput.equals("3")){
                rankOutput = "Three";
            } else if (rankInput.equals("4")){
                rankOutput = "Four";
            } else if (rankInput.equals("5")){
                rankOutput = "Five";
            } else if (rankInput.equals("6")){
                rankOutput = "Six";
            } else if (rankInput.equals("7")){
                rankOutput = "Seven";
            } else if (rankInput.equals("8")){
                rankOutput = "Eight";
            } else if (rankInput.equals("9")){
                rankOutput = "Nine";
            } else if (rankInput.equals("T")){
                rankOutput = "Ten";
            } else if (rankInput.equals("J")){
                rankOutput = "Jack";
            } else if (rankInput.equals("Q")){
                rankOutput = "Queen";
            } else if (rankInput.equals("K")){
                rankOutput = "King";
            } else if (rankInput.equals("A")){
                rankOutput = "Ace";
            } else {
                display = false;
                System.out.print("\nThat's not a valid rank.\n");
            }
        }

        if (display){
            System.out.print("\n" + rankOutput  + " of " + suitOutput + ".\n");
        }

        input.close();
    }
}