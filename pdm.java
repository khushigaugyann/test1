import java.util.Scanner;

public class pdm {
    public static void main(String[] args) {
        int n, sum = 0, r, num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        num = n;

        r = n % 10;
        sum = sum * 10 + r;
        n = n / 10;
        r = n % 10;
        sum = sum * 10 + r;
        n = n / 10;
        r = n % 10;
        sum = sum * 10 + r;
        n = n / 10;
        if (sum == num) {
            System.out.println(num + "is palindrome ");
        } else {
            System.out.println("not palindromre...");
        }
        sc.close();
    }
}
