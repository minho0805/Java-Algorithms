import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String command = input.next();
            if (command.equals("1")) {
                if (!s.empty()) {}
                String command1 = input.next();
                s.push(command1);
            }
            else if (command.equals("2")) {
                if (!s.empty()) {
                    System.out.println(s.peek());
                    s.pop();
                }
                else {
                    System.out.println(-1);
                }
            }
            else if (command.equals("3")) {
                System.out.println(s.size());
            }
            else if (command.equals("4")) {
                if (!s.isEmpty()) {
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }
            else if (command.equals("5")) {
                if (!s.isEmpty()) {
                    System.out.println(s.peek());
                }
                else{
                    System.out.println(-1);
                }
            }

        }

    }
}