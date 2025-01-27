package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_PriceIsSame_ReturnsOne() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_PriceIncreases_ReturnsNumberInterval() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);

        int[] prices = {101};
        int result2 = onlineStockSpan.next(prices[0]);
        assertEquals(2, result2);
    }

    @Test
    public void next_PriceDecreases_ReturnsNumberInterval() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);

        int[] prices = {99};
        int result2 = onlineStockSpan.next(prices[0]);
        assertEquals(3, result2);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertTrue(Arrays.equals(result, new int[0]));
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{1}));
    }

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{1, 2, 3}));
    }

}

class OnlineStackSpan {
    private java.util.Stack<Integer> stack;

    public OnlineStackSpan() {
        this.stack = new java.util.Stack<>();
    }

    public int next(int price) {
        if (!stack.isEmpty()) {
            while (!stack.isEmpty() && (Integer) stack.peek() <= price)
                stack.pop();
        }
        stack.push(price);
        return stack.size();
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && prices[i] >= (Integer) stack.peek())
                    stack.pop();
            }
            result[i] = stack.size();
            stack.push(prices[i]);
        }
        return result;
    }

}