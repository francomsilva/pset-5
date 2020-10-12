import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String grade = input.nextLine();
        boolean display = true;
        double gpa = 0;
        if (grade.length() > 2) {
            display = false;
        } else {
            String letterGrade = grade.substring(0, 1).toUpperCase();
            if (letterGrade.equals("A")) {
                gpa = 4.00;
            } else if (letterGrade.equals("B")) {
                gpa = 3.00;
            } else if (letterGrade.equals("C")) {
                gpa = 2.00;
            } else if (letterGrade.equals("D")) {
                gpa = 1.00;
            } else if (letterGrade.equals("F")) {
                gpa = 0.00;
            } else {
                display = false;
            }
            if (grade.length() == 2) {
                String modifier = grade.substring(1, 2);
                if (letterGrade.equals("F")){
                    display = false;
                } else if (modifier.equals("+")) {
                    gpa += 0.33;
                } else if (modifier.equals("-")) {
                    gpa -= 0.33;
                } else {
                    display = false;
                }
            }
        }
        if (gpa > 4.00) {
            gpa = 4.00;
        }
        if (display){
            System.out.print("\nYour GPA is ");
            System.out.printf("%.2f", gpa);
            System.out.print(".\n");
        } else {
            System.out.print("\nThat's not a valid letter grade.\n");
        }
        input.close();
    }
}