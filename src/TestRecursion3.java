import java.util.Scanner;

public class TestRecursion3 {
    public static void printDigitsReverse(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            printDigitsReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        printDigitsReverse(number);
    }
}
