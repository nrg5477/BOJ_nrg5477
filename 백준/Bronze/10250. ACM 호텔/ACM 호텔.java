import java.util.Scanner;

public class Main {
    public int calculateRoomNumber(int height, int width, int target) {
        int floor = target % height;
        int room = target / height + 1;
        if (floor == 0) {
            floor = height;
            room -= 1;
        }
        return floor * 100 + room;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] targets = new int[n];
        int[] heights = new int[n];
        int[] widths = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            widths[i] = sc.nextInt();
            targets[i] = sc.nextInt();
        }
        Main boj = new Main();
        for (int i = 0; i < n; i++) {
            System.out.println(boj.calculateRoomNumber(heights[i], widths[i], targets[i]));
        }
    }
}
