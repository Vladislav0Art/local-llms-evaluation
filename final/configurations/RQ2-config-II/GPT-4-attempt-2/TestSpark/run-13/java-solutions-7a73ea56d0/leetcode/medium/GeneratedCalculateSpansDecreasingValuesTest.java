package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansDecreasingValuesTest {

    @Test
    public void calculateSpansDecreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {120, 110, 100};
        int[] expectedSpans = {1, 1, 1};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

}