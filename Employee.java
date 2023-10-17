import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);
        System.out.println("enter the basic salary");
        float b = bs.nextFloat();
        System.out.println("enter your pf");
        float pf = bs.nextFloat();
        float hra = b * (30 / 100);
        float ta = b * (20 / 100);
        float da = b * (10 / 100);
        float net = b + hra + da + ta - pf;
        System.out.println("your net salary" + net);
        bs.close();
    }

}