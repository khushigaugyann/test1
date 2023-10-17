import java.util.Scanner;

//Menu-Driven Calculator: Create a menu-driven calculator program that allows the user to choose from a list of operations (addition, subtraction, multiplication, division) using a switch statement. Take two numbers as input and perform the selected operation.
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ch;
        System.out.println("Enter any number: ");
        a = sc.nextInt();
        System.out.println("Enter any number: ");
        b = sc.nextInt();
        System.out.println("Choose a Operation:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("You have entered wrong input....");
        }
        sc.close();
    }
}
