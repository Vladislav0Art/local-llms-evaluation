package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
    }

    @Test
    public void nextTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        assertEquals(2, onlineStockSpan.next(20));
    }

    @Test
    public void nextTest3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(1, onlineStockSpan.next(5));
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expected = {1, 1, 2, 4, 5, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}