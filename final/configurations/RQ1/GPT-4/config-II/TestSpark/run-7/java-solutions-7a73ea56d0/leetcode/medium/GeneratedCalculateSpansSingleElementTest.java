package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{90};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals("Span array for single value prices should have length 1", 1, result.length);
        assertEquals("Span of single value prices should be 1", 1, result[0]);
    }

}