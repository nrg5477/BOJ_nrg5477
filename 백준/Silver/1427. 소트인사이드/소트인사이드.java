import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // n은 자연수
        int n = Integer.parseInt(br.readLine());
        //n의 각 자리수를 떼어내기
        int[] digits = new int[String.valueOf(n).length()];
        int index = 0;
        while (n > 0) {
            digits[index++] = n % 10;
            n /= 10;
        }
        SelectionSort.sort(digits);
        //자연수 형태로 돌리기
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            result = result * 10 + digits[i];
        }
        System.out.println(result);
    }

    public static class SelectionSort {
        public static void sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[minIndex]) { //i번째에 있는 값보다 큰 값이 존재
                        minIndex = j; //해당 자리 기억해두기
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
