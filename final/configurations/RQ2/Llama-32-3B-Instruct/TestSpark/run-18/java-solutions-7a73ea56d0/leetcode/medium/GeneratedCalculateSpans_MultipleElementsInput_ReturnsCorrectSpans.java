package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_MultipleElementsInput_ReturnsCorrectSpans {

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
    public void calculateSpans_MultipleElementsInput_ReturnsCorrectSpans() {
        int[] prices = {1, 2, 3};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2}, result);
    }

}