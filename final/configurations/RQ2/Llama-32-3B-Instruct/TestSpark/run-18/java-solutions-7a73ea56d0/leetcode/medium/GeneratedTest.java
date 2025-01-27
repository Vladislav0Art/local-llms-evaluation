package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.mockito.Mockito;

public class GeneratedTest {

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

    @Test
    public void calculateSpans_SingleElementInput_ReturnsSpanOfOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void next_ValidPrice_ReturnsNextDayPlusCurrentDay() {
        MockStack stack = new MockStack();
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        assertEquals(101, (int) stack.peek());
    }

    @Test
    public void next_EmptyStack_InitializesCorrectly() {
        MockStack stack = new MockStack();
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(0);
        Mockito.verify(stack).push(Mockito.anyInt());
    }

    @Test
    public void next_AddsPriceToStack() {
        MockStack stack = new MockStack();
        stack.push(10);
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(20);
        assertEquals(21, (int) stack.peek());
    }

    @Test
    public void calculateSpans_MultipleElementsInput_ReturnsCorrectSpans() {
        int[] prices = {1, 2, 3};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2}, result);
    }

    @Test
    public void calculateSpans_SameElementsInput_ReturnsSameLengthArray() {
        int[] prices = {1, 1, 1};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{3}, result);
    }

    @Test
    public void calculateSpans_DuplicateElementsInput_ReturnsCorrectLengthArray() {
        int[] prices = {2, 2, 1};
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{3}, result);
    }

}