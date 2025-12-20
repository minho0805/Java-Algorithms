import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();         // 배열 원소의 개수
        int[] arr = new int[N];          // 배열 선언

        for(int i=0; i<N; i++){          // 배열 입력 받기
            int x = input.nextInt();
            arr[i]  = x;
        }
        SelectionSorting(arr);
        for(int j=0; j<N; j++){
            System.out.println(arr[j]);
        }
    }
    // 선택 정렬
    public static void SelectionSorting(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int minIdx = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
