import java.util.Scanner;
public class evenusinifel {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("The entered number " + a + " is even");
        }
        else{
            System.out.println("The entered number " + a + " is odd");
        
        }
        sc.close();
    }
}
