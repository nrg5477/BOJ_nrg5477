import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result = result * sc.nextInt();
        }
        String str = String.valueOf(result);
        int arr[] = new int[10];
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            arr[digit]++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}