import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number: ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("MONDAY");
        } else if (n == 2) {
            System.out.println("TUESDAY");
        } else if (n == 3) {
            System.out.println("WEDNESDAY");
        } else if (n == 4) {
            System.out.println("THRUSDAY");
        } else if (n == 5) {
            System.out.println("SATURDAY");
        } else if (n == 6) {
            System.out.println("TUESDAY");
        } else if (n == 7) {
            System.out.println("SUNDAY");
        } else {
            System.out.println("Invalid day");
        }
        sc.close();
    }
}
