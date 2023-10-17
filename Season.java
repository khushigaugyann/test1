import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        System.out.println("enter number of month=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1, 10, 11, 12:
                System.out.println("winter...");
                break;
            case 2, 3:
                System.out.println("Spring...");
                break;
            case 4, 5, 6:
                System.out.println("Summer..!!");
                break;
            case 7, 8, 9:
                System.out.println("Monsoon");
                break;
            default:
                System.out.println("invalid month");
        }
        sc.close();
    }

}