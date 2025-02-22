package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(5));
        assertEquals(4, stockSpan.next(12));
        assertEquals(2, stockSpan.next(15));
        assertEquals(1, stockSpan.next(20));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 5, 12, 15, 20};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(4, spans[2]);
        assertEquals(1, spans[3]);
        assertEquals(1, spans[4]);
    }

}