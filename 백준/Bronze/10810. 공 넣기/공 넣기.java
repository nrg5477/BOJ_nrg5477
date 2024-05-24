import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt();
            int number = sc.nextInt();
            Arrays.fill(bucket, start, end, number);
        }
        for (int i : bucket) {
            System.out.print(i+" ");
        }

    }
}