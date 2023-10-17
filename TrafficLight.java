import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args, String x) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select operation");
        System.out.println("1 : RED \n 2 : YELLOW \n 3 : GREEN");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(" red light is for stop or wait");
                break;
            case 2:
                System.out.println(" yellow light is for ready to go");
                break;
            case 3:
                System.out.println(" green light is for go");
                break;
            default:
                System.out.println("Invalid grade");
        }
        sc.close();
    }
}
