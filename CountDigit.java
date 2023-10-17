import java.util.Scanner;

public class CountDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int no;
    System.out.println("Enter any no: ");
    no = sc.nextInt();
    while (no != 0) {
      no = no / 10;
      ++count;
    }
    System.out.println(count);
    sc.close();
  }
}