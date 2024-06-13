import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String N = arr[0];
        int B = Integer.parseInt(arr[1]);
        int[] num = new int[N.length()];
        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if (Character.isDigit(c)) {
                num[i] = Character.getNumericValue(c);
            } else {
                num[i] = c - 'A' + 10;
            }
        }
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i] * Math.pow(B, num.length - 1 - i);
        }
        System.out.println(sum);
    }
}