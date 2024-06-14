import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int init = 2;
        for (int i = 0; i < n; i++) {
            init += init - 1;
        }
        System.out.println((int) Math.pow(init, 2));
    }
}