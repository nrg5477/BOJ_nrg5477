import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //(를 만나면 stack에 넣기
        //)를 만나면 stack의 바로 위에 데이터가 (인지 확인 (면 레이저, )면 막대기 끝
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int answer = 0;
        int stack = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack++;
            }else{
                if(str.charAt(i-1)=='('){
                    stack--;
                    answer+=stack;
                }else{
                    stack--;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
