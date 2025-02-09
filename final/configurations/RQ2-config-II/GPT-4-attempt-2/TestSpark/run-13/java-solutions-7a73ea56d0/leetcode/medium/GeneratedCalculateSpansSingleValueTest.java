package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansSingleValueTest {

    @Test
    public void calculateSpansSingleValueTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100};
        int[] expectedSpans = {1};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

}