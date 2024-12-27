package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansWithSamePricesTest {

    @Test
    public void calculateSpansWithSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}