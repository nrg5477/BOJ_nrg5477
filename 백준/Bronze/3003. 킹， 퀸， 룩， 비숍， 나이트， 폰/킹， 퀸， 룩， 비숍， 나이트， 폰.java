import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] arr1 = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i] - Integer.parseInt(arr[i])+" ");
        }
    }
}