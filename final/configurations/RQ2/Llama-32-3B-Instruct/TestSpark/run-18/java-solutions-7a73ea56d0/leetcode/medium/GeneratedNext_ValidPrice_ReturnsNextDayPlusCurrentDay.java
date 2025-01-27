package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedNext_ValidPrice_ReturnsNextDayPlusCurrentDay {

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
    public void next_ValidPrice_ReturnsNextDayPlusCurrentDay() {
        MockStack stack = new MockStack();
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        assertEquals(101, (int) stack.peek());
    }

}