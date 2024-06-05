import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        int cnum1 = 0;
        int cnum2 = 0;
        for (int i = 0; i < 3; i++) {
            cnum1 += ((num1.charAt(i) - '0') * (int) Math.pow(10, i));
            cnum2 += ((num2.charAt(i) - '0') * (int) Math.pow(10, i));
        }
        System.out.println(Math.max(cnum1, cnum2));
    }
}