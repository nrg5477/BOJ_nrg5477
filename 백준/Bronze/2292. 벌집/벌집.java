import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int boundery = 1;
        int cnt = 1;
        while (true) {
            if (n <= boundery) {
                break;
            }
            boundery += 6 * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}