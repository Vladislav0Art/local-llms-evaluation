package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansWithAscendingPricesTest {

    @Test
    public void calculateSpansWithAscendingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 101, 102};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}