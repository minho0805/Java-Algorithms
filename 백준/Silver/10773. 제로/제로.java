import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int K = input.nextInt();
        int sum = 0;
        for (int i = 0; i < K; i++) {
            int n = input.nextInt();
            if (n==0) {
                if (!s.isEmpty()){
                    s.pop();
                }
            }
            else {
                s.push(n);
            }

        }
        for (int i = 0; i < K; i++) {
            if(!s.isEmpty()){
                sum += s.peek();
                s.pop();
            }
        }
        System.out.print(sum);

    }
}