import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[5];
        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextLine();
        }
        sc.close();
        String[][] arr = new String[5][];
        int maxLen = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = input[i].split("");
            if (arr[i].length > maxLen) {
                maxLen = arr[i].length; // Find the maximum length of the line.
            }
        }
        for (int j = 0; j < maxLen; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j < arr[i].length) { // Check the length.
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}