package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        int price = 10;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void nextTest2() {
        int price = 20;
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(2, onlineStockSpan.next(price));
    }

    @Test
    public void calculateSpansTest1() {
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {1, 2, 3, 4};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpansTest2() {
        int[] prices = {50, 40, 30, 20};
        int[] expectedSpans = {1, 1, 1, 1};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}