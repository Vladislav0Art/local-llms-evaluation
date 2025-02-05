package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextPriceEqualtoPreviousTest {

    @Test
    public void nextPriceEqualtoPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(100);
        assertEquals(2, result);
    }

}