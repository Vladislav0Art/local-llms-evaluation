package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansAllPricesAscendingTest {

    @Test
    public void calculateSpansAllPricesAscendingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}