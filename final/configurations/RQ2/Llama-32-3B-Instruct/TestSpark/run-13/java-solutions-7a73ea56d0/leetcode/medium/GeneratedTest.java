package leetcode.medium;

import java.util.*;

public class GeneratedTest {

    public int next(int price) {
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = i + 1;
            } else {
                result[i] = i - stack.peek() + 1;
            }
            stack.push(i);
        }
        return result;
    }

}

public class OnlineStockSpanTest {

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        int[] result = instance.calculateSpans(prices);
        assertTrue(result.length == 0);
    }

    @Test
    public void calculateSpans_SinglePrice_ReturnsSingleElementArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(10, result[0]);
    }

    @Test
    public void calculateSpans_MultiplePrices_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result.length);
        assertTrue(result[0] == 2 || result[0] == 3);
    }

    @Test
    public void next_SinglePrice_ReturnsSingleElement() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        int result = instance.next(price);
        assertEquals(1, result);
    }

    @Test
    public void next_MultiplePrices_ReturnsCorrectNextValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int i = 1; i < prices.length; i++) {
            int result = instance.next(prices[i - 1]);
            assertEquals(result + 1, instance.next(0));
        }
    }

    @Test
    public void calculateSpans_NoStockSpan_ReturnsSingleElement() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result.length);
        assertTrue(result[0] == 1);
    }

    @Test
    public void calculateSpans_WithStockSpan_ReturnsCorrectSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result.length);
        assertTrue(result[0] == 2 || result[0] == 3);
    }

}