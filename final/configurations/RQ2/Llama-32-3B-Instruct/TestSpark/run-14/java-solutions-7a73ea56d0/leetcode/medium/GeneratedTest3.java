package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class GeneratedTest3 {

    @Test
    public void test3() {
        Stack<Integer> stack = new Stack<>();
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan(stack);

        onlineStockSpan.push(10);
        onlineStockSpan.push(7);
        onlineStockSpan.push(5);

        Stack<Integer> nextSpy = spy(new Stack<>());
        onlineStockSpan.next = nextSpy;
        verify(nextSpy).push(1);
        verify(nextSpy).push(1);
        verify(nextSpy).push(2);
    }
}

class OnlineStockSpan {
    private Stack<Integer> stack;

    public OnlineStockSpan(Stack<Integer> stack) {
        this.stack = stack;
    }

    public void push(int x) {
        while (!stack.isEmpty() && stack.peek() <= x) {
            stack.pop();
        }
        int count = stack.isEmpty() ? 1 : stack.peek() + 1;
        stack.push(count);
        next = new Stack<>();
        stack.push(1);
    }

    public void next() {
        if (top == -1) return;
        top--;
    }

    private int top = -1;

    public Stack<Integer> getStack() {
        return stack;
    }

    public Stack<Integer> getNext() {
        return next;
    }

}