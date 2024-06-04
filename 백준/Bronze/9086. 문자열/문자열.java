
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = sc.nextLine();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(strings[i].charAt(0)+""+strings[i].charAt(strings[i].length()-1));
        }
    }
}