package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest_NonZeroCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int count = stockSpan.next(10);
        assertEquals(1, count);
    }

    @Test
    public void calculateSpansTest_NonZeroSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] spans = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}