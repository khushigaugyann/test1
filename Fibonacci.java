import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no: ");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = n1 + n2;
            System.out.println(" " + fib);
            n1 = n2;
            n2 = fib;
        }

        sc.close();
    }
}