package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        assertEquals(stockSpan.list.size(), 1);
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] spans = stockSpan.calculateSpans(prices);
        assertEquals(spans[0], 1);
        assertEquals(spans[1], 2);
        assertEquals(spans[2], 3);
        assertEquals(spans[3], 4);
        assertEquals(spans[4], 5);
    }

}