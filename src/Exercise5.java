import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        double grade = input.nextDouble();
        grade = Math.round(grade);
        if(grade > 100){
            System.out.print("\nGrades above 100 are invalid.\n");
        }else if (grade < 0) {
            System.out.print("\nGrades below 0 are invalid.\n");
        }else if(grade<=59){
            System.out.print("\nYou received a F.\n");
        }else if(grade>=60 && grade<70){
            System.out.print("\nYou received a D.\n");
        }else if(grade >=70 && grade < 80){
            System.out.print("\nYou received a C.\n");
        }else if(grade >= 80 && grade <90){
            System.out.print("\nYou received a B.\n");
        }else if(grade >= 90 && grade <=100){
            System.out.print("\nYou received an A.\n");
        }
        input.close();
    }
}