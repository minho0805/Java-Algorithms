import java.util.Scanner;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Case 1: All three are the same
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }
        // Case 2: Only two are the same
        else if (a == b || a == c) {
            // If a matches either, 'a' is the pair value
            System.out.println(1000 + a * 100);
        }
        else if (b == c) {
            // If a didn't match, but b and c match
            System.out.println(1000 + b * 100);
        }
        // Case 3: All are different
        else {
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }
}