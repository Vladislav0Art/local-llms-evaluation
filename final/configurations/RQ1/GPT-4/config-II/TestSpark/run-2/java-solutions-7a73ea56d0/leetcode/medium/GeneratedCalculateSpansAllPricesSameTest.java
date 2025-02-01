package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansAllPricesSameTest {

    @Test
    public void calculateSpansAllPricesSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {30, 30, 30, 30, 30};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}