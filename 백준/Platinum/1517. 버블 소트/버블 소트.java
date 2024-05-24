import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 스왑개수를 저장하는 변수
    static long swaps = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        mergeSort(arr, new int[n], 0, n - 1);
        System.out.println(swaps);
    }

    public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(arr, temp, leftStart, middle);
        mergeSort(arr, temp, middle + 1, rightEnd);
        mergeHalves(arr, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            // 왼쪽 배열의 요소가 더 작으면
            if (arr[left] <= arr[right]) {
                temp[index] = arr[left];
                left++;
            } else {
                // 왼쪽 배열의 요소가 오른쪽 배열의 요소보다 크면 '역순'이므로 스왑을 카운트
                swaps += (rightStart - left);
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}