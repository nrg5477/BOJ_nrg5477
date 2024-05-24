import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        double avr = Arrays.stream(score).average().getAsDouble();
        int high = Arrays.stream(score).max().getAsInt();
        System.out.println(avr / high * 100);
    }
}