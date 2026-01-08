import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h  = sc.nextInt();
        int m  = sc.nextInt();

        if (m<45){
            if (h==0){
                int M = m+15;
                int H = 23;
                System.out.println(H+" "+M);
            }
            else {
                int M = m+15;
                int H = h-1;
                System.out.println(H+" "+M);
            }
        }
        else {
            int H = h%24;
            int M= m-45;
            System.out.println(H+" "+M);
        }
    }
}