package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPricePositive_SpanIsOne {

    @Test
    public void nextPricePositive_SpanIsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

}