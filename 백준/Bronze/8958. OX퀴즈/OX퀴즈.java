import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] results = new String[N];
        for (int i = 0; i < N; i++) {
            results[i] = br.readLine();
        }


        for (int i = 0; i < results.length; i++) {
            int sum = 0;
            int chechsum = 0;
            for (int j = 0; j < results[i].length(); j++) {
                if (results[i].charAt(j) == 'O'){
                    chechsum++;
                    sum += chechsum;
                }else {
                    chechsum = 0;
                }
            }
            System.out.println(sum);
        }

    }
}