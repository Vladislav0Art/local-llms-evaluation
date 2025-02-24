package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertEquals(1, oss.next(10));
        assertEquals(2, oss.next(20));
        assertEquals(1, oss.next(5));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] prices = {10, 20, 5};
        int[] spans = oss.calculateSpans(prices);
        assertEquals(1, spans[0]);
        assertEquals(2, spans[1]);
        assertEquals(1, spans[2]);
    }

}