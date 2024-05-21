import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int option;

        for (int i = 0; i < n; i++) {
            option = sc.nextInt();
            switch (option){
                case 1:
                    int num = sc.nextInt();
                    stack.push(num);
                    break;
                case 2:
                    if (stack.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    if (stack.isEmpty()){
                        sb.append(1).append('\n');
                    }else {
                        sb.append(0).append('\n');
                    }
                    break;
                case 5:
                    if (stack.isEmpty()){
                        sb.append(-1).append('\n');
                    }else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}