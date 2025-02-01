package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansAllPricesDescendingTest {

    @Test
    public void calculateSpansAllPricesDescendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expectedSpans = {1, 1, 1, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}