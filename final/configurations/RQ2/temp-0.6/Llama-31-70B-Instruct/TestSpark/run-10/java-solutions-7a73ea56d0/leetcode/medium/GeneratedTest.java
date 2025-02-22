package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(1));
        assertEquals(2, stock.next(2));
        assertEquals(1, stock.next(1));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] actual = stock.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}