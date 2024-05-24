import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int dup = (int) Arrays.stream(arr).filter(x -> x == max).count();

        if (dup > 1) {
            System.out.println("?");
        } else {
            for (int i = 0; i < 26; i++) {
                if (arr[i] == max) {
                    System.out.println((char) (i + 'A'));
                    break;
                }
            }
        }
    }
}