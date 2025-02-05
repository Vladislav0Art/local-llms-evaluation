package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextPriceHigherThanAllPreviousTest {

    @Test
    public void nextPriceHigherThanAllPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(200);
        int result = span.next(300);
        assertEquals(3, result);
    }

}