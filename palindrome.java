import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int no, n, s = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        no = sc.nextInt();
        n = no;
        while (no != 0) {
            rem = n % 10;
            s = s * 10 + rem;
            no = no / 10;
        }
        if (n == s)
            System.out.println("Palindrome  number is" + no);
        else
            System.out.println(s);
        sc.close();
    }
}