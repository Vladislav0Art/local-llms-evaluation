package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansMixedValuesTest {

    @Test
    public void calculateSpansMixedValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 90, 120, 60, 80, 70, 160};
        int[] expectedSpans = {1, 1, 2, 1, 2, 1, 6};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

}