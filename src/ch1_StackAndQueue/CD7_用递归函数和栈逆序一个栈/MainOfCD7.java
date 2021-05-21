import java.util.Scanner;
import java.util.Stack;

public class MainOfCD7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = N - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }
        // core function
        reverse(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }


    public static void reverse(Stack<Integer> stack) {
        // TODO
    }
}
