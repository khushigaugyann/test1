import java.util.Scanner;

public class Prm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = sc.nextInt();
            System.out.print("Enter the upper bound of the range: ");
            int upperBound = sc.nextInt();
            System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
            for (int i = lowerBound; i <= upperBound; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
