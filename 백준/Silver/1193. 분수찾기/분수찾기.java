import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 1;
        int M = 1;
        int x = sc.nextInt();

        int down = 0;
        int up = 0;
        for (int i = 1; i < x; i++) {
            if (N == 1 && down == 0) {
                M++;
                down = 1;
                continue;
            }
            if (down == 1) {
                N++;
                M--;
                if (M == 1) {
                    down = 0;
                }
                continue;
            }
            if (M == 1 && up == 0) {
                N++;
                up = 1;
                continue;
            }
            if (up == 1) {
                N--;
                M++;
                if (N == 1) {
                    up = 0;
                }
                continue;
            }
        }
        System.out.println(N+"/"+M);
    }
}