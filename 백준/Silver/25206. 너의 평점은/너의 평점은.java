import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sumA = 0;
        double sumAB = 0;
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            double A = Double.parseDouble(input[1]);
            String B = input[2];
            if (B.equals("P")) {
                continue;
            } else if (B.equals("A+")) {
                sumAB += A * 4.5;
                sumA += A;
            } else if (B.equals("A0")) {
                sumAB += A * 4.0;
                sumA += A;
            }else if (B.equals("B+")) {
                sumAB += A * 3.5;
                sumA += A;
            }else if (B.equals("B0")) {
                sumAB += A * 3.0;
                sumA += A;
            }else if (B.equals("C+")) {
                sumAB += A * 2.5;
                sumA += A;
            }else if (B.equals("C0")) {
                sumAB += A * 2.0;
                sumA += A;
            }else if (B.equals("D+")) {
                sumAB += A * 1.5;
                sumA += A;
            }else if (B.equals("D0")) {
                sumAB += A * 1.0;
                sumA += A;
            }else if (B.equals("F")) {
                sumAB += A * 0.0;
                sumA += A;
            }
        }
        System.out.println(sumAB/sumA);

    }
}