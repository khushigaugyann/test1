import java.util.Scanner;
public class Arearec {
    public static void main(String[] args) {
        int l,b,a;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        l = i.nextInt();
        System.out.println("Enter the breath of rectangle: ");
        b = i.nextInt();
        a = l*b;
        System.out.println("Area of rectangle is: " + a);
        i.close();
    }
    
    
}
