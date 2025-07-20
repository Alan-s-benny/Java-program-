package mod1;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        int a = 0, b = 1, i = 1;

        System.out.print("Fibonacci Series: " + a + " " + b + " ");

        while (i <= n - 2) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
