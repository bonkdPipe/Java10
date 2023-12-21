import java.util.Scanner;
import java.util.Vector;

public class TestRecursion1 {

    static Vector<Integer> arr = new Vector<>();
    public static void RecursiveFunc() {
        Scanner temp = new Scanner(System.in);
        int num = temp.nextInt();
        if(num == 0) {
            return;
        }
        arr.add(num);
        int num2 = temp.nextInt();
        if(num2 == 0) {
            return;
        }
        RecursiveFunc();
    }

    public static void main(String[] args) {
        RecursiveFunc();

        System.out.println(arr);
    }
}
