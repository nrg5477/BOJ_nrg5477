import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            if (n < m) {
                arrayList.add(n);
                break;
            }
            arrayList.add(n % m);// 나머지를 담고
            n /= m;//나눈몫을 다시 구하고
        }
        //arrayList의 숫자들 문자로 변환해서 String으로 출력
        String result = "";
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int num = arrayList.get(i);
            if (num >= 10) {
                result += (char) (num + 55);
            } else {
                result += num;
            }
        }
        System.out.println(result);
    }
}