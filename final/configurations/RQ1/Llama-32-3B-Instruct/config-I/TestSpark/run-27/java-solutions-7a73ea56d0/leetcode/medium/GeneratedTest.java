package leetcode.medium;

import java.util.Stack;

public class GeneratedTest {

    public static Stack<Integer> getStack() {
        return new Stack<>();
    }

    public static void push(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    public static int pop(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.pop();
    }

    public static boolean isEmpty(Stack<Integer> stack) {
        return stack.isEmpty();
    }

    public class Result {
        public int[] result;
        public Stack<Integer> indexStack;

        public Result(int[] result, Stack<Integer> indexStack) {
            this.result = result;
            this.indexStack = indexStack;
        }
    }

}