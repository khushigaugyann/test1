import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student: ");
        marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("GRADE = 'A'");
        } else if (marks < 90 & marks >= 80) {
            System.out.println("GRADE ='B'");
        } else if (marks < 80 & marks >= 70) {
            System.out.println("GRADE ='C'");
        } else if (marks < 70 & marks >= 60) {
            System.out.println("GRADE ='D'");
        } else if (marks < 60 & marks >= 50) {
            System.out.println("GRADE ='E'");
        } else {
            System.out.println("GRADE = 'F'");
        }
        sc.close();
    }
}
