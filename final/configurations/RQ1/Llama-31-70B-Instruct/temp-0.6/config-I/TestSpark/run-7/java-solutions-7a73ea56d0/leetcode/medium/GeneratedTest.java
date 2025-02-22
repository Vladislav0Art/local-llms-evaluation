package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(200));
        assertEquals(1, stockSpan.next(0));
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(1, spans[1]);
        assertEquals(1, spans[2]);
        assertEquals(2, spans[3]);
        assertEquals(1, spans[4]);
        assertEquals(4, spans[5]);
        assertEquals(6, spans[6]);
    }

}