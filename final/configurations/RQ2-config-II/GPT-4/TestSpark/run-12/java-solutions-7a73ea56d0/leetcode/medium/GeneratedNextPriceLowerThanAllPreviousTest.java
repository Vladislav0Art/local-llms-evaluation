package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextPriceLowerThanAllPreviousTest {

    @Test
    public void nextPriceLowerThanAllPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(200);
        int result = span.next(50);
        assertEquals(1, result);
    }

}