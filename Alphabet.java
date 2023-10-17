import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o'
                || ch == 'u' || ch == 'U') {
            System.out.println("It is a vowel..");
        } else {
            System.out.println("It is a consonant.....");
        }
        sc.close();
    }
}
