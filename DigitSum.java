import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, sum = 0, rem = 0;
        System.out.print("Enter any no: ");
        no = sc.nextInt();
        while (no != 0) {
            rem = no % 10;
            sum = sum + rem;
            no = no / 10;
        }
        System.out.println("The sum of the digit = " + sum);
        sc.close();
    }
}