import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = sc.nextLine();
        for (String s : arr) {
            input = input.replace(s, " ");
        }
        System.out.println(input.length());
    }
}