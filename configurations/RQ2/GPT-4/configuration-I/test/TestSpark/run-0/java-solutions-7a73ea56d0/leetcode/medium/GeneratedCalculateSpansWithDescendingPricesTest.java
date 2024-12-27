package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansWithDescendingPricesTest {

    @Test
    public void calculateSpansWithDescendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 99, 98};
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}