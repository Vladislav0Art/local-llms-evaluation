package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansIncreasingValuesTest {

    @Test
    public void calculateSpansIncreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 110, 120};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

}