import java.util.Scanner;
import java.util.Stack;


public class MainOfCD5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyStack myStack = new MyStack();
        int opNum = Integer.parseInt(in.nextLine());
        for (int i = 0; i < opNum; i++) {
            String line = in.nextLine();
            if ("getMin".equals(line)) {
                System.out.println(myStack.getmin());
            } else if ("pop".equals(line)) {
                myStack.pop();
            } else {
                int value = Integer.parseInt(line.split(" ")[1]);
                myStack.push(value);
            }
        }
    }
}


class MyStack {

    public MyStack() {
        // TODO
    }

    public void push(int newNum) {
        // TODO
    }

    public int pop() {
        // TODO
        return 0;
    }

    public int getmin() {
        // TODO
        return 0;
    }
}

