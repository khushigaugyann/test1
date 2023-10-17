import java.util.Scanner;

public class PRIMEWITHOUTLOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("No.is prime...");
        }
        if (n % 2 == 0 || n % 3 == 0) {
            System.out.println("Not prime ");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }
}
