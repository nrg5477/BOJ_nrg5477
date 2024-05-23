import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        String[] targets = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(targets[i]);
            int left = 0;
            int right = n - 1;
            boolean found = false;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (arr[mid] == target) {
                    found = true;
                    break;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (found) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}