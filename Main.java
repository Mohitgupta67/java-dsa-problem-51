import java.util.Scanner;

public class Main {

    static int reverse(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        rev = rev * 10 + n % 10;

        return reverse(n / 10, rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = reverse(n, 0);

        if (n == result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}