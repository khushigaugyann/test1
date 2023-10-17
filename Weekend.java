import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        System.out.println("enter number of day=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1, 2, 3, 4, 5:
                System.out.println("Weekday");
                break;
            case 6, 7:
                System.out.println("weekend......!!!");
                break;

            default:
                System.out.println("invalid day");

        }
        sc.close();
    }
}
