import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h  = sc.nextInt();
        int m  = sc.nextInt();
        int t =  sc.nextInt();

        int M = (m+t)%60;
        int H = (h + (m+t)/60)%24;
        System.out.println(H+" "+M);


    }
}