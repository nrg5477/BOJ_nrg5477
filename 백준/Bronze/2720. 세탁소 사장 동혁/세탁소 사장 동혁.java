import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            String str = "";
            str += C / 25 + " ";
            C %= 25;
            str += C / 10 + " ";
            C %= 10;
            str += C / 5 + " ";
            C %= 5;
            str += C;
            System.out.println(str);
        }
    }
}