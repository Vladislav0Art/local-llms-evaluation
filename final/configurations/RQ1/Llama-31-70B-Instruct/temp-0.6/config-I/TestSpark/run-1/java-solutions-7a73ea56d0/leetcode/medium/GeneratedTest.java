package leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(1));
        assertEquals(1, stock.next(2));
        assertEquals(2, stock.next(3));
        assertEquals(1, stock.next(4));
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] spans = {1, 1, 2, 4, 5, 1};
        OnlineStockSpan stock = new OnlineStockSpan();
        assertArrayEquals(spans, stock.calculateSpans(prices));
    }

}