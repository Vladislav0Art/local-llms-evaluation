package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

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
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        int[] prices = new int[0];
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}