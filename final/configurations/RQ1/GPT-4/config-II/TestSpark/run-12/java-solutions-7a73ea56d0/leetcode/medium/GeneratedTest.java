package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextFirstTimeTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(56);
        assertEquals(1, result);
    }

    @Test
    public void nextNormalFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(56);
        onlineStockSpan.next(50);
        int result = onlineStockSpan.next(60);
        assertEquals(3, result);
    }

    @Test
    public void nextDecreasingFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(58);
        onlineStockSpan.next(56);
        int result = onlineStockSpan.next(50);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansNormalFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 90, 15, 68, 60};
        int[] expected = {1, 2, 1, 4, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansSimpleFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansDecreasingFlowTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {30, 20, 10};
        int[] expected = {1, 1, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}