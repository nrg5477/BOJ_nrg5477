import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine().trim();
        if (inputLine.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = inputLine.split(" ");
            System.out.println(arr.length);
        }
    }
}