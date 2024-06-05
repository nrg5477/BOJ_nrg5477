import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            HashSet<Character> chset = new HashSet<>();
            char last = ' ';
            boolean isGroupWord = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != last && chset.contains(str.charAt(j))) {
                    isGroupWord = false;
                    break;
                } else {
                    chset.add(str.charAt(j));
                    last = str.charAt(j);
                    if (j == str.length() - 1 && isGroupWord) {
                        cnt++;
                    }
                }
            }

        }
        System.out.println(cnt);
    }
}