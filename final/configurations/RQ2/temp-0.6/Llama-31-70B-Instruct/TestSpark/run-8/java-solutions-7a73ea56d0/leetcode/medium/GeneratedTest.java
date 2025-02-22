package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(5));
        assertEquals(2, onlineStockSpan.next(4));
        assertEquals(1, onlineStockSpan.next(1));
        assertEquals(1, onlineStockSpan.next(3));
        assertEquals(2, onlineStockSpan.next(6));
        assertEquals(1, onlineStockSpan.next(2));
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}