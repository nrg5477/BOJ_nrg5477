import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int flag = 1;
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i].equals(arr[arr.length - i - 1])) {
                flag=1;
            } else {
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
    }
}