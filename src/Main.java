import java.util.Scanner;
public class Main {
    public static  String evaluateMarks(int marks){
String letter=null;
        if ( marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Range must be from 0 to 100");}
            if (marks >= 0 && marks = 59) {
                letter="F";
            }
            else if (marks >= 60 && marks <= 69) {
                letter='D';
            }
            else if (marks >= 70 || marks <= 79) {
            letter="C";
            }
            else if (mark >= 80 && marks <= 89) {
                letter="B";
            }
            else if (marks >= 90 && marks > 100) {
                letter="A";
            }
return letter;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter your grade: ");
            int marks = input.nextInt();
            System.out.println(evaluateMarks(marks));
        }
     catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}