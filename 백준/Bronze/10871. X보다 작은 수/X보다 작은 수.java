import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nx = br.readLine().split(" ");
        int n  = Integer.parseInt(nx[0]);
        int x  = Integer.parseInt(nx[1]);

        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}