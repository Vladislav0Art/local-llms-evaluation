package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansRandomPricesTest {

    @Test
    public void calculateSpansRandomPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}