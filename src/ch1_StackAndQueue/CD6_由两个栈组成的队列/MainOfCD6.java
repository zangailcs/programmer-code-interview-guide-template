import java.util.Scanner;
import java.util.Stack;

public class MainOfCD6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TwoStacksQueue queue = new TwoStacksQueue();
        int opNum = Integer.parseInt(in.nextLine());
        for (int i = 0; i < opNum; i++) {
            String line = in.nextLine();
            if ("peek".equals(line)) {
                System.out.println(queue.peek());
            } else if ("poll".equals(line)) {
                queue.poll();
            } else {
                int value = Integer.parseInt(line.split(" ")[1]);
                queue.add(value);
            }
        }
    }
}


class TwoStacksQueue {

    public TwoStacksQueue() {

    }

    // push 栈向 pop 栈倒入数据
    private void pushToPop() {
        // TODO
    }

    public void add(int pushInt) {
        // TODO
    }

    public int poll() {
        // TODO
        return 0;
    }

    public int peek() {
        // TODO
        return 0;
    }
}
