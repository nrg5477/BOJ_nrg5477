import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];
        for (int i = 0; i < n; i++) {
            bucket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt() - 1; //0
            int end = sc.nextInt() - 1; //3
            int mid = (start + end) / 2; //2
            for (; start <= mid; start++, end--) { //0,1
                int temp = bucket[start];
                bucket[start] = bucket[end];
                bucket[end] = temp;
            }
        }

        for (int i : bucket) {
            System.out.print(i+" ");
        }
    }
}