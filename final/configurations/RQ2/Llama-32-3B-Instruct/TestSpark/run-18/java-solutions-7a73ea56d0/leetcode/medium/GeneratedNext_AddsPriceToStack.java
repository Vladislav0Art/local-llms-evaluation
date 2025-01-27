package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedNext_AddsPriceToStack {

    public class MockStack {
        private Stack<Integer> stack = new Stack<>();

        public void push(int value) {
            stack.push(value);
        }

        public int peek() {
            return stack.peek();
        }
    }

    @Test
    public void next_AddsPriceToStack() {
        MockStack stack = new MockStack();
        stack.push(10);
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(20);
        assertEquals(21, (int) stack.peek());
    }

}