package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(5);
        assertEquals(1, result);
    }

    @Test
    public void nextTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(2, result);
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 12, 8, 9};
        int[] result = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 3, 1, 2};

        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 5, 12, 8, 9, 11, 13};
        int[] result = stockSpan.calculateSpans(prices);
        int[] expected = {1, 2, 1, 3, 1, 2, 3, 4};

        assertArrayEquals(expected, result);
    }

}