package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_DuplicateElementsInput_ReturnsCorrectLengthArray {

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
    public void calculateSpans_DuplicateElementsInput_ReturnsCorrectLengthArray() {
        int[] prices = {2, 2, 1};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{3}, result);
    }

}