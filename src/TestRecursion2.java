import java.util.Scanner;

public class TestRecursion2 {
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigits(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        printDigits(number);
    }
}
