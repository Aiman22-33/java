import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
 Double num;
 System.out.println(“Enter the number”);
Scanner input = new Scanner(System.in);
number1 = input.nextDouble();
 boolean flag = false;
 for (int i = 2; i <= num / 2; ++i) {
 if (num % i == 0) {
 flag = true;
 break;
 }
 }
 if (!flag)
 System.out.println(num + " is a prime number.");
 else
 System.out.println(num + " is not a prime number.");
 }
}
